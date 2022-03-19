import sys
def binary_sort(x,a):
    start=0
    end=len(a)-1
    while (start <= end):
        mid = (start+end)//2
        if x == a[mid]:
            return 1
        elif x > a[mid]:
            start = mid+1
        else:
            end = mid-1
    return 0

N = int(input())
A = list(map(int,sys.stdin.readline().split()))
A.sort()

M = int(input())
X = list(map(int,sys.stdin.readline().split()))
for x in range(M):
    print(binary_sort(X[x],A))