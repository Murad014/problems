
def solve(n, a, b):

    temp = n
    n -= 1

    cach = [0 for i in range(pow(10, 6))]
    x    = 0
    arr  = [a]
    ans  = []
    sn   = (n * (2*1 + (n-1)*1)) // 2
    mmm  = 1
    while mmm != sn:
        if a > b:
            b, a = a, b
        aa = arr[x] + a
        bb = arr[x] + b
        if cach[aa] == 0:
            arr.append(aa)
        if cach[bb] == 0:
            arr.append(bb)

        cach[aa] = 1
        cach[bb] = 1
        x += 1
        mmm += 1

    return (arr[len(arr) - temp::])



t = int(input())
for _ in range(t):
    n = int(input())
    a = int(input())
    b = int(input())

    ans1 = solve(n, a, b)
    ans2 = solve(n, b, a)
    res  = list(set(ans1 + ans2))
    res.sort()
    print(*res)
