import sys
from collections import deque

def dfs(n):
    visited[n]=True
    for i in graph[n]:
        if not visited[i]:
            dfs(i)

n = int(input())
m = int(input())
cnt=0
# 인접 리스트 만들기
graph = [[] for i in range(n+1)]
visited = [False]*(n+1)

for i in range(m):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

# 그래프 리스트 안 원소 sort하기
for i in graph:
    i.sort()
dfs(1)
for i in visited:
    if i==True:
        cnt+=1
print(cnt-1)