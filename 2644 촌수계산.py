import sys
from collections import deque
n = int(sys.stdin.readline())
one, two = map(int,sys.stdin.readline().split())
m = int(sys.stdin.readline())

# graph 만들기
graph=[[] for i in range(n+1)]
visited=[False]*(n+1)
visited[0]=True

for i in range(m):
    x, y = map(int,sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)


# one이랑 two 중에 더 작은걸 부모로 하니까 그걸 queue에 넣어서 나머지거가 나올때까지 돌리기
if one>two:
    up=two
    down=one
else:
    up=one
    down=two

cnt=0
queue = deque([(up,cnt)])
visited[up]=True

check=False

while queue:
    tmp,cnt = queue.popleft()

    if tmp == down:
        print(cnt)
        check=True
        break

    for i in graph[tmp]:
        if not visited[i]:
            queue.append((i,cnt+1))
            visited[i]=True
if not check:
    print(-1)