from functools import cmp_to_key

def comp(a, b):
    if a[0] > b[0]:
        return 1
    if a[0] < b[0]:
        return -1
    else:
        return 0



def solve(arr):
    arr = sorted(arr, key=cmp_to_key(comp))
    a   = arr[0][0]
    b   = arr[0][1]
    ans = []
    for i in range(len(arr) - 1):
        a2 = arr[i+1][0]
        b2 = arr[i+1][1]
        if b == a2:
            b = b2
        elif a2 < b and b < b2:
            b = b2
        elif a2 > b:
            ans.append([a, b])
            a = a2
            b = b2




    ans.append([a, b])
    for i in ans:
        print(i[0], i[1], sep = " ", end = " ")

    print("")



t = int(input())
for _ in range(t):
    n    = input()
    arr  = list(map(int, input().split()))
    arr2 = []
    for i in range(0, len(arr) - 1, 2):
        arr2.append([arr[i], arr[i+1]])

    solve(arr2)


