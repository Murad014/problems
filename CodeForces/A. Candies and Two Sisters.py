# Author Murad


def Solve(n):
	a = n
	b = 0

	if n % 2 == 0:
		print((n//2) - 1)
	else:
		print((n-1) // 2)


t = int(input())

for _ in range(t):
	n = int(input())
	Solve(n)

