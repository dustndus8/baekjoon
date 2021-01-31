import java.util.Scanner;

public class Main {
    public static int hansu(int n) {

        int cnt = 0;    //한수 세는 변수

        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 1000) {    //1000일때 예외처리
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int a = i / 100;  //100의자리수
                int b = (i / 10) % 10;  //10의자리수
                int c = i % 10;

                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
            return cnt;
        }


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(hansu(n));


    }

}
