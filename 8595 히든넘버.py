t=int(input())
s=input()
_sum=0
numbers="0123456789"
hidden=''
for i in s:
    if i in numbers:
        hidden+=i
    else:
        hidden+=' '
print(sum(list(map(int, hidden.split()))))




