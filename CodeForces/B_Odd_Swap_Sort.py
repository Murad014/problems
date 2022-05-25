



t = int(input())


for _ in range(t):
	n = int(input())
	arr = list(map(int, input().split()))

	ans = "YES"

	odd  = []
	even = []

	for i in arr:
		if i % 2 == 0:
			even.append(i)
		else:
			odd.append(i)


	for i in range(len(odd)-1):
		if odd[i] > odd[i+1]:
			ans = "NO"

	if ans == "YES":
		for i in range(len(even)-1):
			if even[i] > even[i+1]:
				ans = "NO"

	print(ans)







