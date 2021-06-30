chess = []
for _ in range(8):
    chess.append(list(map(str, list(input()))))
cnt=0
for i in range (8):
    for j in range (8):
        if i%2==0 and j%2==0 or i%2==1 and j%2==1:
            if chess[i][j]=='F':
                cnt+=1
print(cnt)
