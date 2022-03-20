import sys

N = int(input())
stack2 = []
cnt = 1

l = list(map(int,sys.stdin.readline().split()))
while l:
    if cnt==l[0]:
        cnt+=1
        l.pop(0)
    else:
        stack2.append(l.pop(0))

    while stack2:
        if stack2[-1] == cnt:
            stack2.pop()
            cnt+=1
        else:
            break

if len(stack2)==0:
    print("Nice")
else:
    print("Sad")

