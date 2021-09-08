n = int(input())
for i in range(n):
    str = list(input())
    s = 0
    for j in range(len(str)):
        if str[j]=='(':
            s+=1
        else:
            s-=1
        if s<0:
            print("NO")
            break
    if s>0:
        print("NO")
    elif s==0:
        print("YES")
