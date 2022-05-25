
def solve(n ,arr):

	for i in range(len(arr)-2):
		if arr[i+1] > arr[i] and arr[i+1] > arr[i+2]:
			print("NO")
			return

	print("YES")





t = int(input())


for _ in range(t):
	n = int(input())

	arr = list(map(int, input().split()))

	solve(n, arr)