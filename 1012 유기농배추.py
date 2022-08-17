import sys

def makeField(m,n):
    field = [[0]*m for i in range(n)]
    return field

def dfs(field,i,j):
    stack=[]
    stack.append([i,j])
    while stack:
        # 상하좌우 확인
        tmp = stack.pop()
        field[tmp[0]][tmp[1]] = -1

        # 상
        if tmp[0]!=0:
            if field[tmp[0]-1][tmp[1]] == 1 :
                field[tmp[0]-1][tmp[1]] = -1
                #dfs(field, tmp[0]-1, tmp[1])
                stack.append([tmp[0]-1,tmp[1]])

            elif field[tmp[0]-1][tmp[1]] == 0 or field[tmp[0]-1][tmp[1]] == -1:
                pass
            elif not stack:
                break

        # 하
        if tmp[0]!=len(field)-1:
            if field[tmp[0]+1][tmp[1]] == 1 :
                field[tmp[0]+1][tmp[1]] = -1
                #dfs(field, tmp[0]+1, tmp[1])
                stack.append([tmp[0]+1, tmp[1]])
            elif field[tmp[0]+1][tmp[1]] == 0 or field[tmp[0]+1][tmp[1]] == -1:
                pass
            elif not stack:
                break

        # 좌
        if tmp[1]!=0:
            if field[tmp[0]][tmp[1]-1] == 1 :
                field[tmp[0]][tmp[1]-1] = -1
                #dfs(field, tmp[0], tmp[1]-1)
                stack.append([tmp[0], tmp[1]-1])
            elif field[tmp[0]][tmp[1]-1] == 0 or field[tmp[0]][tmp[1]-1] == -1:
                pass
            elif not stack:
                break

        # 우
        if tmp[1]!=len(field[0])-1:
            if field[tmp[0]][tmp[1]+1] == 1 :
                field[tmp[0]][tmp[1]+1] = -1
                #dfs(field,tmp[0],tmp[1]+1)
                stack.append([tmp[0], tmp[1]+1])
            elif field[tmp[0]][tmp[1]+1] == 0 or field[tmp[0]][tmp[1]+1] == -1:
                pass
            elif not stack:
                break


T = int(sys.stdin.readline())

for t in range(T):
    tmp = sys.stdin.readline().split()
    M = int(tmp[0])
    N = int(tmp[1])
    K = int(tmp[2])



    field = makeField(M,N)
    for k in range(K):
        tt = sys.stdin.readline().split()
        field[int(tt[1])][int(tt[0])] = 1
    cnt = 0
    # 탐색 시작
    for i in range(N):
        for j in range(M):
            if field[i][j] == 1 :
                cnt += 1
                dfs(field,i,j)
            else:
                field[i][j] = -1
    print(cnt)