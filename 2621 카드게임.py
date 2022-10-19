import sys
from collections import Counter
colorlist=[]
numlist=[]

color_cnt=[0]*4 #  R[0] B[1] Y[2] G[3]
num_cnt=[0]*10 # 0 1 2 3  ~ 9

# 입력 받기
for i in range(5):
    tmp= list(sys.stdin.readline().split())
    color = tmp[0]
    num = int(tmp[1])

    colorlist.append(color)
    numlist.append(num)


# 점수 정하기

# 정렬
colorlist.sort()
numlist.sort()

# 각각 몇개 씩 나왔는지 count
counter_color_tmp = Counter(colorlist) # dict으로 저장
counter_num_tmp = Counter(numlist)

counter_num_key = list(counter_num_tmp.keys())
counter_color_value = list(counter_color_tmp.values())
counter_num_value = list(counter_num_tmp.values())


# 연속 개수 세는 함수
def isAllSeq(counter_num):
    seq=1
    tmp = counter_num[0]
    for i in range(1,len(counter_num)):
        if tmp+1 == counter_num[i]:
            tmp = counter_num[i]
        else:
            return 0
    return 1

def checkEqualNumber(counter_num_key,counter_num_value):
    max_num=0
    if 4 in counter_num_value:
        return (2,counter_num_key[counter_num_value.index(4)])
    elif 3 in counter_num_value:
        # 3번
        if 2 in counter_num_value:
            return(3,counter_num_key[counter_num_value.index(3)],counter_num_key[counter_num_value.index(2)])
        # 6번
        else:
            return (6,counter_num_key[counter_num_value.index(3)])
    elif 2 in counter_num_value:
        # 7번
        if counter_num_value.count(2) == 2:
            tmp=[]
            for i in range(len(counter_num_value)):
                if counter_num_value[i] == 2:
                    tmp.append(counter_num_key[i])
            tmp.sort()
            return (7,tmp[0],tmp[1])
        else:
            return (8, counter_num_key[counter_num_value.index(2)])

checkEq = checkEqualNumber(counter_num_key,counter_num_value)

# 가장 높은 숫자
max_num = numlist[-1]

if checkEq:
    # 2번
    if checkEq[0]==2:
        print(800+checkEq[1])

    # 3번
    elif checkEq[0] == 3:
        print(checkEq[1] * 10 + checkEq[2] + 700)

    # 6번
    elif checkEq[0] == 6:
        print(400 + checkEq[1])

    # 7번
    elif checkEq[0] == 7:
        print(checkEq[2] * 10 + checkEq[1] + 300)

    # 8번
    elif checkEq[0] == 8:
        print(checkEq[1] + 200)

else:
    if 5 in counter_color_value:
        # 1번
        if isAllSeq(numlist):
            print(900 + max_num)
        # 4번
        else:
            print(600 + max_num)
    # 5번
    elif isAllSeq(numlist):
        print(500 + max_num)
    else:
        print(max_num + 100)