
import math
import functools as cmp_to_key

def calc(a, b):
	aa = a % 2; bb = b % 2
	calc = math.fabs(a - b)

	if (aa == bb or calc == 1): 
		return True

	return False


def solve(arr, n):
	mem = []
	for i in range(len(arr)):
		cnt = 0
		for j in range(len(arr)):
			if calc(arr[i], arr[j]) is True and i != j:
				cnt += 1



		mem.append([arr[i], cnt])

	res = sorted(mem, key = lambda x: (x[1], x[1])) 
	#print(res)  
	#adad
	for i in range(len(res)):

		for j in range(i+1, len(res)):

			if res[i] != -1 and res[j] != -1:
				if calc(res[i][0], res[j][0]) == True:
					res[i] = -1
					res[j] = -1

	


	for i in range(len(res)):
		if    res[i] != -1:
			return "NO"

	return "YES"

		



t = int(input())

for _ in range(t):

	n = int(input())
	arr = list(map(int, input().split()))

	ans = solve(arr, n)

	print(ans)


