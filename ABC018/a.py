lis = [int(input()) for _ in range(3)]
for v in lis:
    print(sorted(lis)[::-1].index(v) + 1)
