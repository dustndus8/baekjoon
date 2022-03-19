import sys

N = int(input())
stack = []
cnt = 0
for i in range(N):
    l = sys.stdin.readline().rstrip()
    for j in l:
        if (len(stack) == 0 or stack[len(stack) - 1] != j):
            stack.append(j)
        else:
            stack.pop()
    if (len(stack) == 0):
        cnt += 1
    stack.clear()
print(cnt)
