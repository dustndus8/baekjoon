n, k = map(int,input().split())

yo=[]
result=[]
idx=0
for i in range (1,n+1):
    yo.append(i)    #[1,2,3,4,5,6,7]

for j in range (n):
    idx += k-1
    if idx >= len(yo):
        idx = idx%len(yo)
    result.append(str(yo.pop(idx)))
print("<",", ".join(result)[:],">",sep='')




