n, m = list(map(int, input().split()))
j = 0
for i in range(1, n+1):
    if i % 2 == 0:
        if j % 2 == 0:
            print((m-1) * ".", "#", sep = "")
        else:
            print("#", "." * (m-1), sep = "")
        j += 1
    else:
        print(m * "#")
