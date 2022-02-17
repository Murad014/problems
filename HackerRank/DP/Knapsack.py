import sys
sys.setrecursionlimit(3001)

mem = {}
mem2 = [0 for i in range(2001)]
ans = False

def Calc(n, k, arr):
    global ans, mem

    try:
    
        if mem[n] is True:
            ans = True
            return True
        
        elif mem[n] is False:
            return False

    except:
        pass

    if n == 0:
        ans = True
        return True

    elif n < 0:
        return False

    #print(" =====> ", n)
    for i in range(len(arr)):

        res = Calc(n-arr[i], k, arr)

        mem[n] = res



    if n == 0:
        ans = True
        return True

    elif n < 0:
        return False




def Solve(n, k, arr):
    global ans
    global mem

    t = False

    for i in range(k, 0, -1):
        Calc(i, k, arr)

        if ans is True:
            print(i)
            t = True
            break;

        ans = False
        mem = {}

    if t is False:
        print(0)





t = int(input())

for _ in range(t):
    n, k = list(map(int, input().split()))
    arr = list(map(int, input().split()))

    Solve(k, k, arr)
    ans = False
    mem = {}
    
