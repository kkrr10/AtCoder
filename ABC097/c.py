import heapq


s = input()
k = int(input())

least = []

for i in range(len(s)):
    for j in range(i+1, len(s)+1):
        if s[i:j] in least:
            continue
        if len(least) < k:
            heapq.heappush(least, s[i:j])
            continue
        tmp = [heapq.heappop(least) for i in range(k)]
        least = tmp.copy()
        heapq.heapify(least)
        if tmp[-1] > s[i:j]:
            heapq.heappush(least, s[i:j])
        else:
            break

least5 = [heapq.heappop(least) for i in range(k)]
print(least5[-1])
