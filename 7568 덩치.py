import sys

n = int(sys.stdin.readline())
person = []
cnt = [1]*n
for i in range(n):
    tmp = list(map(int,sys.stdin.readline().split()))
    person.append(tmp)
i=0
while i<n:
    j=0
    while j<n:
        if person[i][0] < person[j][0] and person[i][1] < person[j][1]:
            cnt[i] +=1
        j+=1
    i+=1
for c in cnt:
    print(c,end=' ')



