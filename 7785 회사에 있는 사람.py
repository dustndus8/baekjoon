import sys
n = int(sys.stdin.readline())
people={}
for i in range(n):
    name, status = sys.stdin.readline().split()
    if status == 'enter':
        people[name] = 'enter'
    else:
        if people[name]: # 이미 딕셔너리 안에 있는거면
            del people[name]

for i in sorted(people,reverse=True):
    print(i)





