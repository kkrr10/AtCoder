n = int(input())
a = list(map(int, input().split()))

mx = state = mx_per_step = 0
su = [0]

for i in range(n):
    step = su[-1] + a[i]
    mx_per_step = max(mx_per_step, step)
    su.append(step)
    mx = max(mx, state + mx_per_step)
    state += step

print(mx)
