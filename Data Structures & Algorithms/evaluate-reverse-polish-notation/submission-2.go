func evalRPN(tokens []string) int {
    stack := list.New()
	for _, token := range tokens {
		switch token {
		case "+":
			stack.PushBack(stack.Remove(stack.Back()).(int) + stack.Remove(stack.Back()).(int))
		case "*":
			stack.PushBack(stack.Remove(stack.Back()).(int) * stack.Remove(stack.Back()).(int))
		case "-":
			first := stack.Remove(stack.Back()).(int)
			second := stack.Remove(stack.Back()).(int)
			stack.PushBack(second - first)
		case "/":
			first := stack.Remove(stack.Back()).(int)
			second := stack.Remove(stack.Back()).(int)
			stack.PushBack(second / first)
		default:
			num, _ := strconv.Atoi(token)
			stack.PushBack(num)
		}
	}
	return stack.Remove(stack.Back()).(int)
}
