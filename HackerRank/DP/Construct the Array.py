n, k, x = list(map(int, input().split())) # 4 3 2

mem = [0, 1]
st = k - 1
sm = 0

for i in range(3, n+1):
    step = st - (mem[len(mem)-1])
    mem.append(step % ((10**9) + 7))
##    print(step)
    st = (st * (k-1)) % (10**9 + 7)
##    print("ST: ", st)

ans = (mem[len(mem) - 1]);

if x == 1:
    if n % 2 == 0:
        ans -= 1
    else:
        ans += 1

print(ans)
##print(mem)
