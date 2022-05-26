import sys

def eratos(n,k):
    a=[i for i in range(n+1)]
    i=2
    cnt=0
    while i<=n:
        j=1
        while j<=n:
            if i*j<=n:
                num = i*j
                if a[num]!=0:
                    a[num]=0
                    cnt+=1
            if k==cnt:
                return num
            j+=1
        i+=1

inp = list(map(int,sys.stdin.readline().split()))
print(eratos(inp[0],inp[1]))