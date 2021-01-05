// Stack.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include <iostream>
#include <string.h>

using namespace std;

int stack[10001];
int top = -1;


int empty() {

    if (top < 0) return 1;
    else return 0;
}

void pop() {
    if (empty() == 1)
        cout << "-1" << "\n";
    else
    {
        cout << stack[top] << "\n";
        stack[top--]=0;
    }

}

void push(int x) {

    stack[++top] = x;

}



int main()
{

    int n;
    cin >> n;

    string func;

    for (int i = 0; i < n; i++) {
    
        cin >> func;
        if (func.compare("push")==0)
        {
            int num;
            cin >> num;
            push(num);
           

        }

        else if (func.compare("pop") == 0)
        {
            pop();
        }
        else if (func.compare("top") == 0) 
        {
            if (empty())
                cout << "-1" << "\n";
            else
                cout << stack[top] << "\n";
        
        }

        else if (func.compare("empty") == 0) {
        
            cout << empty() <<"\n";
        
        }
        else if (func.compare("size") == 0)
        {
            cout << top + 1<<"\n";
        }
    }

}
