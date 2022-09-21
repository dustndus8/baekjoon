import sys
from collections import deque
maps=[]
m,n= map(int,sys.stdin.readline().split())
zero_cnt=0
# maps 만들기
for i in range(n):
    tmp = list(map(int,sys.stdin.readline().split()))
    maps.append(tmp)
    zero_cnt+=tmp.count(0)
#print('maps',maps)

def bfs(answer):

    queue = deque()
    for a in answer:
        queue.append(a)

    check_zero_cnt=0

    visit=[0]
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while queue:
        x, y , cnt = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m:
                if maps[nx][ny] == 0:
                    check_zero_cnt+=1
                    queue.append((nx, ny, cnt + 1))
                    visit.append(cnt+1)
                    #print(nx,ny,queue,maps)
                    maps[nx][ny] = 2
                    #print()
    if check_zero_cnt==zero_cnt:
        return max(visit)
    else:
        return -1
# for문으로 돌려서 1인 곳만 bfs( )
answer=[]
for i in range(n):
    for j in range(m):
        if maps[i][j] == 1:
            answer.append((i,j,0))

print(bfs(answer))