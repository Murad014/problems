
n, k = list(map(int, input().split()))

all_need = 4 * 60

cost  = k
pos = all_need - cost

temp = 0
ans = 0

for i in range(1, n+1):
	temp += 5 * i

	if temp > pos:
		break
	
	ans += 1

print(ans)

