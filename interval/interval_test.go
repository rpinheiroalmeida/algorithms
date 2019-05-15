package interval

import "testing"

func TestIsOverlap(t *testing.T) {
	cases := []struct {
		x interval
		y interval
	}{
		{interval{-4, 2}, interval{1, 5}},
	}

	for _, c := range cases {
		wasIsOverlaped := IsOverlap(c.x, c.y)
		if !wasIsOverlaped {
			t.Errorf("Expected Intervals Overlaped (%v) and (%v) is (%v), but got FALSE",
				c.x, c.y, wasIsOverlaped)
		}
	}
}

func TestIsNotOverlap(t *testing.T) {
	cases := []struct {
		x interval
		y interval
	}{
		{interval{-4, 2}, interval{3, 5}},
	}

	for _, c := range cases {
		wasIsOverlaped := IsOverlap(c.x, c.y)
		if wasIsOverlaped {
			t.Errorf("Expected Intervals Overlaped (%v) and (%v) is (%v), but got FALSE",
				c.x, c.y, wasIsOverlaped)
		}
	}
}

func TestOverlapedIntervals(t *testing.T) {
	cases := []struct {
		a    []int64
		b    []int64
		want int
	}{
		{
			[]int64{1, 12, 42, 70, 36, -4, 43, 15},
			[]int64{5, 15, 44, 72, 36, 2, 69, 24},
			5,
		},
	}

	for _, c := range cases {
		gotIntervals := ProcessInterval(c.a, c.b)

		if gotIntervals != c.want {
			t.Errorf("Expected Intervals's quantity (%v) but got (%v)",
				c.want, gotIntervals)
		}
	}
}
