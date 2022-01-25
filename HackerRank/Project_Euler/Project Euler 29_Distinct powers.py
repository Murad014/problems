import math
from itertools import combinations

n = int(input())




def calc_perm(arr):
	global n
	mem = []

	for i in range(len(arr)):
		for j in range(i+1, len(arr)):
			mem.append(arr[i] * arr[j])

	return len(list(set(mem)))


# This method finds primes factors
def frac_primes(N): # 12 = 4 * 3 = 2 * 2 * 3
	arr = []
	n = N
	i = 2
	while n % i == 0:
		arr.append(2)
		n //= 2

	i += 1


	while n > 1:
		while n % i == 0:
			arr.append(i)
			n //= i
		i += 1


	if(n > 1):
		arr.append(n)


	#print("N: ", N, end=" => ")
	res = calc_perm(arr)

	print(N, end=" => ")	
	print(arr)
	return res


	

sq = int(math.sqrt(n))

all_p = (n-1) ** 2 # all possibilties


for i in range(2, sq+1):
	for j in range(i, n+1):
		all_p -= frac_primes(j)

print(all_p)
#for i in range(2, sq+1):
	#for j in range(2, n+1):
		#print("J: ", j)
		#frac = frac_primes(j)

		#all_p -= frac


#print(all_p)