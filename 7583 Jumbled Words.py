while True:
    s = input()
    if s=='#':
        exit()
    l = list(map(str,s.split(' ')))
    tmp=[]
    new_word=''
    result=''
    for i in range(len(l)):
        for j in range(len(l[i])-2,0,-1):
            tmp.append(l[i][j])
        if len(l[i]) > 1:
            tmp.insert(0,l[i][0])
        tmp.insert(len(l[i])-1, l[i][len(l[i])-1])
        new_word="".join(tmp)
        result+=new_word
        result+=' '
        tmp=[]
    print(result.rstrip())









