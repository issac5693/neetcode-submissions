func evalRPN(tokens []string) int {
    stack := list.New()
	_ = stack
	set := make(map[string]struct{})
	set["+"] = struct{}{}
	set["-"] = struct{}{}
	set["*"] = struct{}{}
	set["/"] = struct{}{}
	for i := 0; i < len(tokens); i++ {
		if _, exists := set[tokens[i]]; exists {
			//it's a sign
			num1 := stack.Remove(stack.Back())
			num2 := stack.Remove(stack.Back())
			switch sign := tokens[i]; sign {
			case "+":
				stack.PushBack(num1.(int) + num2.(int))
			case "-":
				stack.PushBack(num2.(int) - num1.(int))
			case "*":
				stack.PushBack(num1.(int) * num2.(int))
			case "/":
				stack.PushBack(num2.(int) / num1.(int))
			}
		} else {
			num, _ := strconv.Atoi(tokens[i])
			stack.PushBack(num)
		}
	}

	return stack.Remove(stack.Back()).(int)
}
