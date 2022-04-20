import math

def calc(n):
	part01 = 2 * ( (pow(n, 2) + n) // 2 )

	n -= 1

	part02 = ( (pow(n, 2) + n) // 2 )

	ans = part01 + part02

	return ans



arr = [0]

limit = 79999
for i in range(1, limit+1):
	arr.append(calc(i))



#print(arr)

t = int(input())


def binarySearch(low, high):
	global arr
	while True:
			mid = low + (high-low) // 2

			if n > arr[mid]:
				low = mid+1

			if n < arr[mid]:
				high = mid-1

			if high < low:
				return [low, arr[low-1]]


			if n == arr[mid]:
				return [mid, arr[mid]]

#			print(low, high, mid, n)


# [0, 2, 7, 15, 26, 40, 57, 77, 100, 126, 155, 187, 222, 260, 301, 345, 392, 442, 495, 551]
for _ in range(t):
	n = int(input())
	low = 0 
	high = len(arr)-1

	ans = 0
	
	while n > 0:
		ind, res = binarySearch(0, high)
		
		if res == 0:
			break

		if ind > 0:
			ans += 1

		#print(res)
		n -= res

	print(ans)







	





