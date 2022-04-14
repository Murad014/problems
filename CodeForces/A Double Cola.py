import math

n = int(input()) # 7

arr = ["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"]

sm = n + 4

pr = 5
while True:
	if pr > sm:
		pr //= 2
		break

	pr *= 2


start = pr #6

rep = start // 5

step = n - (start - 4) 

ans = math.floor((step / rep) + 1)

print(arr[ans-1])

