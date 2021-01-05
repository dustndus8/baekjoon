// Stack.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include <iostream>
#include <string.h>

using namespace std;

int stack[100000];
int top = -1;


int empty() {

    if (top < 0) return 1;
    else return 0;
}

void pop() {
    if (empty() == 1)
        cout << "비어있음" << "\n";
    else
    {
        //cout << stack[top] << "\n";
        stack[top--]=0;
    }

}

void push(int x) {

    stack[++top] = x;

}



int main()
{

    int k;
    cin >> k;


    for (int i = 0; i < k; i++) {

        int input;
        cin >> input;
        if (input == 0) {
            pop();
        }
        else
            push(input);
    }
    int sum = 0;

    
    for(int i=0;i<top+1;i++)
        sum+=stack[i];

    cout << sum;
}
