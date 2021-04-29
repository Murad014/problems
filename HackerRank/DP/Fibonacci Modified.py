
# SIMPLE Tabulation - Bottom Up

t1, t2, n = list(map(int, input().split()))

fibo = [t1, t2]
for i in range(2, n):
    fibo.append(fibo[i-2] + pow(fibo[i-1], 2))
print(fibo[len(fibo) - 1])
