import math


def Solve(N):

    col = [0 for i in range(N)]
    pounds = [0, 1, 2, 5, 10, 20, 50, 100, 200]
    mem = [col for i in range(9)]

    for i in range(9):
        mem[i][0] = 1


    for row in range(1, 9):

        for col in range(1, N):
            sub = col - pounds[row]
            if sub == 0:
                mem[row][col] = (mem[row - 1][col] + 1) % (10**9 + 7)

            elif (sub > 0):
                mem[row][col] = (mem[row][sub] + mem[row-1][col]) % (10**9 + 7)

            else:
                mem[row][col] = mem[row-1][col] % (10**9 + 7)





    return mem



t = int(input())

N = 10**5+7
list_mem = Solve(N)

for _ in range(t):
    n = int(input())
    n = n % (10**9+7)
    print(list_mem[8][n])



