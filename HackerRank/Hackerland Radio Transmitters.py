

n, k = list(map(int, input().split()))
arr  = list(map(int, input().split()))
arr2 = [0 for i in range(max(arr)+1)]

for i in arr:
    arr2[i] = 1


st   = 0
ans  = 0
while st <= len(arr2):
    if st >= len(arr2):
        break

    if arr2[st] == 1:
        if st + k >= len(arr2):
            ans += 1
            break

        if arr2[st+k] == 1:
            st = st + k*2 + 1
            ans += 1
        elif arr2[st+k] == 0:
            for j in range(st+k, -1, -1):
                if arr2[j] == 1:
                    st = j
                    st = 1 + st + k
                    ans += 1
                    break

    else:
        st += 1

print(ans)
