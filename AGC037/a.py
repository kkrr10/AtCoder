s = input()
i = 0
exc = 0

while i < len(s) - 1:
    if s[i] == s[i+1]:
        exc += 1
        i += 2
    i += 1

print(len(s) - exc)
