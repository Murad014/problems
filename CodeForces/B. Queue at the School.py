

n, t = list(map(int, input().split()))


qu = list(input())


for i in range(t):
	j = 0
	while True:
		if j == n-1:
			break


		try:
			if qu[j] == "B" and qu[j+1] == "G":
				qu[j] = "G"
				qu[j+1] = "B"
				

				j += 1
			#print(qu)
		except:
			break
		else:
			j += 1

	#print("--------------------------------")



print("".join(qu))



