n = int(input())
 
arr = list(map(int, input().split()))
 
mem = [0 for i in range(101)]
 
clerk = 0
 
ans = "YES"
 
if arr[0] > 25:
	ans = "NO"
	print(ans)
	quit()
 
 
 
for i in range(len(arr)):

	rm = arr[i] - 25

	if rm == 25:
		if mem[25] <= 0:
			ans = "NO"
			break
		else:
			mem[25] -= 1

	if rm == 75:

		if mem[50] > 0 and mem[25] > 0:
			mem[50] -= 1
			mem[25] -= 1


		elif mem[25] >= 3:
			mem[25] -= 3

		else:
			ans = "NO"
			break


	mem[arr[i]] += 1

 
 
 
#print(mem)
 
 
print(ans)
