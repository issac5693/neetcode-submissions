func checkInclusion(s1 string, s2 string) bool {
    if len(s1) > len(s2) {
		return false
	}
	var fqS1 [26]int
	var fqS2 [26]int
	k := len(s1)
	for i := range s1 {
		fqS1[s1[i]-97] += 1
		fqS2[s2[i]-97] += 1
	}
	if fqS1 == fqS2 {
		return true
	}
	for i := 1; i <= len(s2)-len(s1); i++ {
		fqS2[s2[i-1]-97] -= 1
		fqS2[s2[k]-97] += 1
		if fqS1 == fqS2 {
			return true
		}
		k++
	}
	return false
}
