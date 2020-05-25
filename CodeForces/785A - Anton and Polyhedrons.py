n = int(input())
res = 0
for i in range(n):
    a = input()
    if a == "Tetrahedron":
        res += 4
    if a == "Cube":
        res += 6
    if a == "Octahedron":
        res += 8
    if a == "Dodecahedron":
        res += 12
    if a == "Icosahedron":
        res += 20
print(res)

