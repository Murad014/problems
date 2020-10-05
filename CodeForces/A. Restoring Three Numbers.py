arr = list(map(int, input().split()))
mx = max(arr)
arr.remove(mx)
c = abs(mx - arr[0])
a = abs(mx - arr[1])
b = abs(mx - arr[2])
print(a, b, c)



