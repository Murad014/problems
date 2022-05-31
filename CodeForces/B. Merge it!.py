


import math
t = int(input())

for _ in range(t):

	n = int(input())
	arr = list(map(int, input().split()))

	mem = [0 for i in range(3)]

	for i in range(len(arr)):
		mem[arr[i] % 3] += 1


	ans = 0

	ans += mem[0]
	pos = min(mem[1], mem[2])
	mem[1] -= pos
	mem[2] -= pos
	ans += pos
	ans += (mem[1] + mem[2]) // 3
	

	print(int(ans))


