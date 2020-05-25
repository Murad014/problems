s = input()
s = s.strip("}")
s = s.strip("{")
s = s.split(", ")
if len(set(s)) == 1 and s[0] == "":
    print(0)
    quit()
print(len(set(s)))
