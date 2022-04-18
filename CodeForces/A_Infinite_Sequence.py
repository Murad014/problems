a, b, c = list(map(int, input().split()))


calc = b - a

ans = "NO"

if a == b:
	ans = "YES"

elif c == 0:
	ans = "NO"

elif calc % c == 0 and ((calc  < 0 and c < 0) or (calc > 0 and c > 0)):
	ans = "YES"




print(ans)
