n = int(input())
num=list(map(int,input().split()))
v = int(input())
cnt=0
for i in range (n):
    if num[i]==v:
        cnt+=1
print(cnt)
