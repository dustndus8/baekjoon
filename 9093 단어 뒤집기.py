def reverse_word(s):
    s = s.split()
    full_word=''
    for i in range (len(s)):
        new_word = ''
        for j in range (len(s[i])-1,-1,-1):
            new_word+=str(s[i][j])
        full_word+=new_word
        full_word+=' '
    return full_word

t=int(input())
for i in range (t):
    sen=input()
    print(reverse_word(sen))