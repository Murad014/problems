s = input()
c1 = 0
c2 = 0
for i in s:
    if i.isupper() is True:
        c1 += 1
    if i.islower() is True:
        c2 += 1
if c1 == c2:
    print(s.lower())
elif c1 < c2:
    print(s.lower())
else:
    print(s.upper())
