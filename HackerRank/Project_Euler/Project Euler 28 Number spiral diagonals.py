# Author Murad

import math

initial   = [3, 5, 7, 9]
initial_r = [10, 12, 14, 16]


def Solve(n):
	if n == 1:
		print(1)
		return

	elif n == 3:
		print(25)
		return


	org = n
	n = (n) // 2
	ans = 0

	for i in range(len(initial)):
		R1 = initial_r[i]
		T1 = initial[i]

		p1 = n * T1 + (R1 * ( ( ((n - 1) + 1) * (n-1) ) // 2 ) )

		kk = n - 2
		if (kk) % 2 != 0: # Odd
			#print('ODD')
			kk = (kk+1) // 2
			#print("Odd", kk)
			p2 =  ( ( (kk) * (2 * (kk) + 1) * (2 * (kk) - 1) ) // 3 ) * 8

		else: # Even
			#print('EVEN')
			kk = kk // 2
			#print("Even", kk)
			p2 = (( 2 * (kk) * ( (kk) + 1) * (2 * (kk)+1) ) // 3) * 8

		Stn = p1 + p2
		
		ans += Stn

		#print(org, n, p1, p2, p1+p2)


	print((ans+1) % (10**9 + 7))



t = int(input())

while t != 0:

	n = int(input())

	Solve(n)

	t -= 1




