t=int(input())
for i in range(t):
    s=input().split()
    for j in range(len(s)):
        if len(s[j]) == 4:
            s[j]='****'
    print(" ".join(s))
    print()





