
def solve(arr):
    mem = [0 for i in range(len(arr))]

    for i in range(len(arr)):
        for j in range(len(arr[i])):
            mem[j] += arr[i][j]

    for i in range(len(arr)):
        test = 0
        for j in range(len(arr[i])):
            rem = mem[j] - arr[i][j]
            ss = sum(arr[i]) - arr[i][j]
            if rem == ss:
                test += 1
        if test == 0:
            print("Impossible")
            return
    print("Possible")



q = int(input())
for _ in range(q):
    n   = int(input())
    arr = []
    for _ in range(n):
        temp = list(map(int, input().split()))
        arr.append(temp)

    solve(arr)
