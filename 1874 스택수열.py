n = int(input())
cnt = 1
stack = []
result = []

for i in range(n):
    num=int(input())

    while cnt<=num:
        stack.append(cnt)
        result.append('+')
        cnt+=1
    if stack[-1]==num:
        stack.pop()
        result.append('-')
    else:
        print('NO')
        exit(0)
for i in result:
    print(i)











