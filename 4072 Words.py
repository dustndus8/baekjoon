while True:
    s = input()
    if s=='#':
        exit()
    l = list(map(str,s.split()))
    for i in range(len(l)):
        print(l[i][::-1],end=' ')




