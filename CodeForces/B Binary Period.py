def solve(t): # 110
	s = list(map(int, list(t)))
	
	if len(t) <= 2:
		print(t)
		return

	if len(set(t)) == 1:
		print(t)
		return


	cnt0 = 0 
	cnt1 = 0

	for i in range(len(s)):
	
		if(s[i] == 0):
			cnt0 += 1

		else:
			cnt1 += 1

	if s[0] == 0:
		add = "01"
		cnt1 *= 20


	else:
		add = "10"
		cnt0 *= 20

	ans = ""
	for i in range(len(t) * 20):
		ans += add

		cnt0 -= 1
		cnt1 -= 1


		#print(len(ans), len(t) * 2)
		if len(ans) > len(t) * 2:
			ans = ans[:len(ans)-2:]


		if cnt0 <= 0 and cnt1 <= 0:
			print(ans)
			return








T = int(input())


for _ in range(T):
	t = input()
	
	solve(t)


