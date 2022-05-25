

def solve(s):
	stack = [s[0]]

	for i in range(1, len(s)):

		if len(stack) != 0:
			if stack[len(stack) - 1] + s[i] == "AB" or stack[len(stack) - 1] + s[i] == "BB":
				stack.pop()

			else:
				stack.append(s[i])

		else:
			stack.append(s[i])

	print(len(stack))



t = int(int(input()))

for _ in range(t):
	s = input()
	solve(s)