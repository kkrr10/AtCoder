s = input()
for i in range(6):
    print(s.count(chr(ord("A") + i)), end="")
    if i == 5:
        print()
    else:
        print(" ", end="")
