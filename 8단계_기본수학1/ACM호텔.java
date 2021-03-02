
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int Y;
        int X;

        for (int k = 0; k < t; k++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            // Y(층)를 구하는법 == N%H , 단 N%H==0이면 H가 Y
            // X(거리)를 구하는 법 나눈 몫에서 1 더함, 단 N%H==0이면 1더하지않음
            if (n % h == 0) {
                Y = h * 100;    // 최소 세자리수 이므로 100 곱함
                X = (n/h);
            } else {
                Y = (n % h) * 100;
                X = (n/h) + 1;
            }

            int XXYY = Y + X;

            System.out.println(XXYY);



        }


    }
}



