
def solve(n, arr):
	dic = {}

	for i in arr:
		try:
			dic[i] += 1
		except:
			dic[i] = 1


	mx = 0
	for i in dic:
		mx = max(dic[i], mx)

	#print(dic)
	for i in range(mx, -1, -1):
		if i <= mx-1:
			if i <= len(dic):
				print(i)
				return	


		if i <= len(dic) - 1:
			print(i)
			return


	print(0)



t = int(input())


for _ in range(t):
	
	n = int(input())
	arr = list(map(int, input().split()))

	solve(n, arr)



