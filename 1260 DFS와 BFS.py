import sys
from collections import deque
def dfs(n):
    print(n,end=' ')
    visited[n]=True
    for i in graph[n]:
        if not visited[i]:
            dfs(i)

def bfs(n):
    visited[n]=True
    queue=deque([n])
    while queue:
        v = queue.popleft()
        print(v,end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True



n, m, v = map(int, sys.stdin.readline().split())
graph = [[] for i in range(n+1)]
visited=[False]*(n+1)

# 인접 그래프 만들기
for i in range(m):
    a,b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

# 인접 그래프 안에 있는 [] sort하기
for i in range(1,n+1):
    graph[i].sort()

# DFS
dfs(v)

# 초기화시키고 BFS
visited=[False]*(n+1)
print()
bfs(v)
