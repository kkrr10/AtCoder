s1 = input()
s2 = input()
print("No" if s1.count("#") == 1 and s2.count("#") == 1 and s1.index("#") != s2.index("#") else "Yes")
