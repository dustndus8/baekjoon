import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] APT = new int[15][15];  // 최대값으로 배열크기 지정

        for (int i = 0; i < 15; i++) {
            APT[0][i] = i;  // 0층 i호에는 i명 산다
            APT[i][1] = 1;  //i층 1호는 1로 초기화
        }

        for (int i = 1; i < 15; i++) {  //1층~14층
            for (int j = 2; j < 15; j++) {  //2호~14호
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        int t = sc.nextInt();   // Test case 수

        for (int s = 0; s < t; s++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(APT[k][n]);

        }
    }
}



