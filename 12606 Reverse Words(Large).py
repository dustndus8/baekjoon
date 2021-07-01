t=int(input())
for i in range(t):
    s = list(map(str,input().split(' ')))
    tmp = ''
    for j in range(len(s)-1,-1,-1):
        tmp += ' '
        tmp += s[j]
    print('Case #',end='')
    print(i+1,end='')
    print(':',end='')
    print(tmp)