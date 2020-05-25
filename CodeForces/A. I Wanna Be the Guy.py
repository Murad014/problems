n = int(input())
org = [0 for i in range(n+1)]

X = list(map(int, input().split()))
Y = list(map(int, input().split()))
for i in range(1, len(X)):
    org[X[i]] = 1
for i in range(1, len(Y)):
    org[Y[i]] = 1
for i in range(1, len(org)):
    if org[i] == 0:
        print("Oh, my keyboard!")
        quit()
print("I become the guy.")



