from functools import cmp_to_key

def compare(a, b):

    if a[1] == b[1]:
        return (a[1] > b[1]) - (a[1] < b[1])

    if a[1] > b[1]:
        return -1

    return 1


n = int(input())
arr = []
services = []
for i in range(n):
    o, p = list(map(int, input().split()))
    srv = o + p
    arr.append([i, o+p])

arr = sorted(arr, key = cmp_to_key(compare), reverse = True)

for i in arr:
    print(i[0]+1, end=" ")

