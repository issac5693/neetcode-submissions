func dailyTemperatures(temperatures []int) []int {
	stack := list.New()
	for index, temperature := range temperatures {
		for stack.Len() > 0 && stack.Back().Value.([2]int)[1] < temperature {
			temp := stack.Remove(stack.Back()).([2]int)
			temperatures[temp[0]] = index - temp[0]
		}
		stack.PushBack([2]int{index, temperature})
	}

	for stack.Back() != nil {
		temperatures[stack.Remove(stack.Back()).([2]int)[0]] = 0
	}
	return temperatures
}
