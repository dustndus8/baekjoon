// sort_for_age.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include <iostream>
#include <string>


using namespace std;


int age[100000];
string name[1000000];
int cnt[100000];

void sort_for_age(int * a, string * n, int * c, int inp) {

    for (int i = 0; i < inp; i++)
    {
        for (int j = 0; j < inp - i - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                int tmp_a = a[j + 1];
                a[j + 1] = a[j];
                a[j] = tmp_a;

                string tmp_n = n[j + 1];
                n[j + 1] = n[j];
                n[j] = tmp_n;

                int tmp_c = c[j + 1];
                c[j + 1] = c[j];
                c[j] = tmp_c;
                //Arrays.sort(int_s);
            }
            //나이 같으면 먼저 입력한 게 먼저
            else if (a[j] == a[j + 1])
            {
                if (c[j] > c[j + 1])
                {
                    int tmp_a = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp_a;

                    string tmp_n = n[j + 1];
                    n[j + 1] = n[j];
                    n[j] = tmp_n;

                    int tmp_c = c[j + 1];
                    c[j + 1] = c[j];
                    c[j] = tmp_c;
                }

            }

        }
    }

    //StringBuilder sb = new StringBuilder();

    // 출력
    for (int i = 0; i < inp; i++)
    {
        cout << a[i] << " " << n[i] << "\n";
    }

}




int main()
{
    ios_base::sync_with_stdio(false);

    int input;
    int a;
    string n;
    int c;
    cin >> input;

    //나이, 이름, 입력순서 배열
    


    for (int i = 0; i < input; i++)
    {
        cin >> a >> n;
        age[i] = a;
        name[i] = n;
        cnt[i] = i;
    }

    sort_for_age(age, name, cnt, input);
}


