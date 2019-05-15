package interval

import (
	"sort"
)

type pair struct {
	a, b int64
}

type byInitialPointFromPair []pair

func (x byInitialPointFromPair) Len() int           { return len(x) }
func (x byInitialPointFromPair) Less(i, j int) bool { return x[i].a < x[j].a }
func (x byInitialPointFromPair) Swap(i, j int)      { x[i], x[j] = x[j], x[i] }

func remove(slice byInitialPointFromPair, pos int) byInitialPointFromPair {
	slice[pos] = slice[len(slice)-1]
	return slice[:len(slice)-1]
}

func merge(x, y pair) pair {
	return pair{x.a, y.b}
}

// ProcessInterval - process a set of intervals, merging when two interval overlaping
func ProcessInterval(a, b []int64) int {
	var sortedPairs byInitialPointFromPair

	for i := len(a) - 1; i >= 0; i-- {
		sortedPairs = append(sortedPairs, pair{a[i], b[i]})
	}

	sort.Sort(sortedPairs)

	var result byInitialPointFromPair
	result = append(result, sortedPairs[0])

	j := 0
	for i := 1; i < len(a); i++ {
		if IsOverlap(result[j], sortedPairs[i]) {
			mergedInterval := merge(result[j], sortedPairs[i])
			result = remove(result, j)
			result = append(result, mergedInterval)
		} else {
			j = j + 1
			result = append(result, sortedPairs[i])
		}
	}

	return len(result)
}

// IsOverlap - check if two intervals are overlaping
func IsOverlap(x, y pair) bool {
	return x.b-y.a >= 0
}
