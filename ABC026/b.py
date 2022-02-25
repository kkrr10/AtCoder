import math


print(sum([r**2 * [1, -1][idx % 2] for idx, r in enumerate(sorted([int(input()) for _ in range(int(input()))])[::-1])]) * math.pi)
