package interval

import (
	"fmt"
	"sort"
)

type interval struct {
	a, b int64
}

type byInitialPoint []interval

func (x byInitialPoint) Len() int           { return len(x) }
func (x byInitialPoint) Less(i, j int) bool { return x[i].a < x[j].a }
func (x byInitialPoint) Swap(i, j int)      { x[i], x[j] = x[j], x[i] }

func remove(slice byInitialPoint, pos int) byInitialPoint {
	slice[pos] = slice[len(slice)-1]
	return slice[:len(slice)-1]
}

func merge(x, y interval) interval {
	return interval{x.a, y.b}
}

// ProcessInterval - process a set of intervals, merging when two interval overlaping
func ProcessInterval(a, b []int64) int {
	var sortedIntervals byInitialPoint

	for i := len(a) - 1; i >= 0; i-- {
		sortedIntervals = append(sortedIntervals, interval{a[i], b[i]})
	}

	sort.Sort(sortedIntervals)

	var result byInitialPoint
	result = append(result, sortedIntervals[0])

	fmt.Println(sortedIntervals)

	j := 0
	for i := 1; i < len(a); i++ {
		fmt.Println("Merging: ", result[j], " and ", sortedIntervals[i])
		if IsOverlap(result[j], sortedIntervals[i]) {
			mergedInterval := merge(result[j], sortedIntervals[i])
			result = remove(result, j)
			result = append(result, mergedInterval)
		} else {
			j = j + 1
			result = append(result, sortedIntervals[i])
		}
		fmt.Println("Resulting = ", result)
	}

	fmt.Println(result)
	return len(result)
}

// IsOverlap - check if two intervals are overlaping
func IsOverlap(x, y interval) bool {
	return x.b-y.a >= 0
}
