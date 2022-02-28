

n = int(input())

arr = list(map(int, input().split()))


#arr = sorted(arr, reverse = True)

arr.sort()

ans = 0
while len(arr) != 0:

	last = arr.pop()
	
	if len(arr) == 0:
		ans += 1
		break

	if last == 4:
		ans += 1


	else:

		calc = last + arr[0]

		while True:

			if calc == 4:
				arr.pop(0)
				ans += 1
				break

			if calc > 4:
				ans += 1
				break

			if len(arr) == 0:
				break

			if calc < 4:
				arr.pop(0)

				if len(arr) == 0:
					ans += 1
					break
					
				calc += arr[0]

print(ans)





