import sys
n,m = map(int,sys.stdin.readline().split())
d=[]
b=[]

for i in range(n):
    s1=sys.stdin.readline()
    d.append(s1)
for j in range(m):
    s2=sys.stdin.readline()
    b.append(s2)
# 집합으로 만들어 &로 중복 찾고 다시 리스트로 만듦
db=list(set(d)&set(b))
db.sort()
print(len(db))
for v in db:
    print(v,end='')


