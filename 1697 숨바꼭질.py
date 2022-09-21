import sys
from collections import deque
n, k= map(int,sys.stdin.readline().split())

queue = deque()
cnt=0
queue.append((n,cnt))
visited=[False]*100001
visited[n]=True

while queue:
    x, cnt= queue.popleft()
    if k==x:
        print(cnt)
        break
    if 0<=x+1<=100000 and not visited[x+1]:
        queue.append((x+1,cnt+1))
        visited[x+1]=True


    if 0<=x-1<=100000 and not visited[x-1]:
        queue.append((x-1,cnt+1))
        visited[x-1]=True


    if 0<=2*x<=100000 and not visited[2*x]:
        queue.append((2*x,cnt+1))
        visited[2*x]=True