import sys
n = int(sys.stdin.readline())
q = []
for i in range(n):
    s = sys.stdin.readline()
    if 'push' in s:
        l = s.split()
        q.append(l[1])
    elif 'pop' in s:
        if len(q) < 1:
            print(-1)
        else:
            print(q[0])
            del q[0]
    elif 'size' in s:
        print(len(q))
    elif 'empty' in s:
        if len(q)<1:
            print(1)
        else:
            print(0)
    elif 'front' in s:
        if len(q)<1:
            print(-1)
        else:
            print(q[0])
    elif 'back' in s:

        if len(q)<1:
            print(-1)
        else:
            print(q[-1])



