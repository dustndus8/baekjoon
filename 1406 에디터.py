from sys import stdin
stack1=list(stdin.readline().strip())
stack2=[]

m = int(input())

for i in range(m):
    tmp = stdin.readline()
    if tmp[0]=='L':
        if len(stack1)==0:
            continue
        stack2.append(stack1.pop())
    elif tmp[0]=='D':
        if len(stack2)==0:
            continue
        stack1.append(stack2.pop())
    elif tmp[0]=='B':
        if len(stack1)==0:
            continue
        stack1.pop()
    else:
        stack1.append(tmp[2])

stack1.extend(stack2[::-1])
print(''.join(stack1))

