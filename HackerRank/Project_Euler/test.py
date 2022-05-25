import math

n = int(input())
all_p = pow((n-1), 2) # for all possibilites

################################# PART 1 #####################################
st = 2

mem = [{}]

mem2 ={}

while st <= n:
	ll = int(math.log10(st) / math.log10(2))

	temp = []
	for i in range(2, n+1):

		calc = ll * i
		temp.append(calc)

	temp = set(temp).union(mem[ll-1])

	mem.append((set(temp)))


	st *= 2


############################### PART 2 ########################################

arr = [0 for i in range(n+1)]
ans = 0

for i in range(2, n+1):
	st = i

	if arr[i] == 0:
		arr[i] = 1
		while True:

			if st == n:
				break

			if st > n:
				st //= i
				break

			st *= i

			if st <= n:
				arr[st] = 1

		k=1
		while(pow(i, k)<=n):
			k+=1

		ans += len(mem[k - 1])



print(ans)
			









