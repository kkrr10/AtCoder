s = input()
t = input()

ans = []

for i in range(len(s) - len(t) + 1):
    ok = True
    for j in range(len(t)):
        if s[i+j] != '?' and s[i+j] != t[j]:
            ok = False
            break
    if ok:
        ans.append(s[:i].replace('?', 'a') + t + s[i+len(t):].replace('?', 'a'))

if ans:
    print(sorted(ans)[0])
else:
    print('UNRESTORABLE')
