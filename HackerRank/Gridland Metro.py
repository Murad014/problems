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

    line = 0
    for i in ans:
        line += (i[1] - i[0]) + 1

    return line



n, m, k = list(map(int, input().split()))
dic = {}

for i in range(k):
    r, c1, c2 = list(map(int, input().split()))

    try:
        dic[r].append([c1, c2])
    except:
        dic[r] = []
        dic[r].append([c1, c2])

busy = 0
for i in dic:
    busy += solve(dic[i])

ans = (m * n) - busy
print(ans)




