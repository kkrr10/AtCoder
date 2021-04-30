A = [list(map(int, input().split())) for i in range(3)]
n = int(input())

for i in range(n):
    b = int(input())
    for i in range(3):
        for j in range(3):
            if A[i][j] == b:
                A[i][j] = 0

ok = False

for i in range(3):
    if A[i][0] == A[i][1] == A[i][2] == 0:
        ok = True
    if A[0][i] == A[1][i] == A[2][i] == 0:
        ok = True

if A[0][0] == A[1][1] == A[2][2] == 0:
    ok = True

if A[0][2] == A[1][1] == A[2][0] == 0:
    ok = True

print("Yes" if ok else "No")
