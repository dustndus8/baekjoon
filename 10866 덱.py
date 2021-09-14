import sys
n = int(sys.stdin.readline())
dq=[]
for i in range (n):
    s = sys.stdin.readline()
    if 'push_front' in s:
        t = s.split()
        dq.insert(0,t[1])
    elif 'push_back' in s:
        t = s.split()
        dq.append(t[1])
    elif 'pop_front' in s:
        if len(dq)<1:
            print(-1)
        else:
            print(dq[0])
            del dq[0]
    elif 'pop_back' in s:
        if len(dq)<1:
            print(-1)
        else:
            print(dq[-1])
            del dq[-1]
    elif 'size' in s:
        print(len(dq))
    elif 'empty' in s:
        if len(dq) <1:
            print(1)
        else:
            print(0)
    elif 'front' in s:
        if len(dq)<1:
            print(-1)
        else:
            print(dq[0])
    elif 'back' in s:
        if len(dq)<1:
            print(-1)
        else:
            print(dq[-1])






