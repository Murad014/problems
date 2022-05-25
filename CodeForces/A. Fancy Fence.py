# Author: Murad

pols = []

for i in range(3, 1000):
	ans = ((i-2) * 180) / i
	if ans == int(ans):
		pols.append(int(ans))

#print(pols)

t = int(input())
for _ in range(t):
	a = int(input())
	
	if a in pols:
		print("YES")
	else:
		print("NO")

