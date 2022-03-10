
n= int(input())
arr = []



for _ in range(n):
	a, b = list(map(int, input().split()))
	arr.append([a, b])


#arr.sort()
arr = sorted(arr,key=lambda x: (x[0],x[1]))
#print(arr)

for i in range(1, len(arr)):
	price 	= arr[i][0]
	quality = arr[i][1]

	pre_price 	= arr[i-1][0]
	pre_quality = arr[i-1][1]

	if quality < pre_quality and price > pre_price:
		print("Happy Alex")
		quit()


print("Poor Alex")