display1 = list(map(int, input().split()))
h2, w2 = map(int, input().split())

print("YES" if h2 in display1 or w2 in display1 else "NO")
