n = int(input())
alpha = {}

for i in range(97, 123):
    alpha[chr(i)] = 0
    
word = input()
word = word.lower()
for i in range(len(word)):
    alpha[word[i]] = 1


for i in range(97, 123):
    if alpha[chr(i)] == 0:
        print("NO")
        quit()

print("YES")
