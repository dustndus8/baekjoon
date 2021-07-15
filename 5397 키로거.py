n = int(input())
for i in range(n):
    L=input()
    stack1 = []
    stack2 = []
    for x in L:
        if x=='<':
            if stack1:
                stack2.append(stack1.pop())
        elif x=='>':
            if stack2:
                stack1.append(stack2.pop())
        elif x=='-':
            if stack1:
                stack1.pop()
        else:
            stack1.append(x)
    stack1.extend(stack2[::-1])
    print("".join(stack1))




