import sys
from collections import deque

n = int(sys.stdin.readline())
# maps 만들기
maps=[]
for i in range(n):
    tmp = input()
    tmp_list=[]
    for j in range(n):
        tmp_list.append(int(tmp[j]))
    maps.append(tmp_list)

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(x,y):
    cnt = 1
    queue = deque([(x,y)])
    maps[x][y]=-1
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]

            if 0<=nx<n and 0<=ny<n:
                if maps[nx][ny]==1:
                    queue.append((nx,ny))
                    maps[nx][ny]=-1
                    cnt +=1
    return cnt

answer = []
big_cnt=0
for i in range(n):
    for j in range(n):
        if maps[i][j] == 1:
            big_cnt+=1
            answer.append(bfs(i,j))
print(big_cnt)
answer = sorted(answer)
for a in answer:
    print(a)