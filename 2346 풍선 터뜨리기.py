n = int(input())
list_n = list(map(int,input().split()))
list_index = []
result = []

#인덱스 리스트 설정하기
for i in range(1,n+1):
    list_index.append(i)

idx=0
#k는 풍선 속 숫자
k = list_n.pop(idx)
result.append(list_index.pop(idx))

while (len(list_n)>0):
    if k<0:
        idx = (idx+k)%len(list_n)
    else:
        idx = (idx+k-1)%len(list_n)
    k=list_n.pop(idx)
    result.append(list_index.pop(idx))
for j in range(n):
    print(result[j],end=' ')

