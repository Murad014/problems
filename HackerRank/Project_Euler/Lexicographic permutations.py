import math

ans = ""
 

def solveSub(n, string, q):  # N = 3, S = "abc"
    global ans

    if len(string) == 0:
        return

    all = math.factorial(n)
    groups = n
    mem = all // groups

    st = math.ceil(q / mem)

    # print("Str: ", n-1, string, ans, st-1)
    # print(all, groups, mem, q)

    ans += string[st-1]

    del string[st-1]

    solveSub(n-1, string, q % mem)





t = int(input())
string = "abcdefghijklm"

for _ in range(t):
    N = int(input())

    temp = list(string)

    solveSub(len(string), temp, N)

    print(ans)
    ans = ""



