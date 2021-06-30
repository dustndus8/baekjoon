while True:
    s=input()
    if s=="***":
        exit()
    result =""
    for i in range(len(s)-1,-1,-1):
        result+=s[i]
    print(result)
