import "slices"
func findMeetingKm(position1 float64, position2 float64, speed1 float64, speed2 float64) float64 {
	meetingPoint := (position2 - position1) / (speed1 - speed2)
	return position1 + (speed1 * meetingPoint)
}
func carFleet(target int, position []int, speed []int) int {
	m := make(map[int]int, len(position))

	for index, pos := range position {
		m[pos] = speed[index]
	}
	slices.Sort(position)
	stack := make([]int, 0, len(position))
	stack = append(stack, position[0])
	for i := 1; i < len(position); i++ {
		for len(stack) != 0 && m[position[i]] < m[stack[len(stack)-1]] {
			if findMeetingKm(float64(position[i]), float64(stack[len(stack)-1]), float64(m[position[i]]), float64(m[stack[len(stack)-1]])) <= float64(target) {
				stack = stack[:len(stack)-1]
			} else {
				break
			}
		}
		stack = append(stack, position[i])
	}
	return len(stack)
}
