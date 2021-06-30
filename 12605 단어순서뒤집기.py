def reverse_word(s):
    s = s.split()
    n=len(s)
    new_word=''
    for i in range (n-1,-1,-1):
        new_word+=' '
        new_word+=str(s[i])
    return new_word

t=int(input())
for i in range (t):
    sen=input()
    print("Case #",end='')
    print(i+1,end='')
    print(":",end='')
    print(reverse_word(sen))