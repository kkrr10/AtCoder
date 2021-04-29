n = int(input())
li = [input() for i in range(n)]
se = set(li)

for s in li:
    if "!" + s in se:
        print(s)
        exit()

print("satisfiable")
