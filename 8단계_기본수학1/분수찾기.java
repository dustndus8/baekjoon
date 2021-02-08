import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int t = 1;  //대각선 수
        int preSum = 0;  // 직전 대각선까지의 칸 누적합

        while (n != preSum) {
            // 직전 대각선 누적합+해당 대각선 개수
            if (n <= t + preSum) {
                if (t % 2 == 1) {   // 대각선 홀수

                    // 위로가는 방향
                    // 분자는 점점 감소, 분모는 점점 증가
                    // 분자는 n번째-
                    System.out.println((t-(n-preSum-1))+"/"+(n-preSum));
                    break;
                } else {    // 대각선 짝수
                    System.out.println((n-preSum)+"/"+(t-(n-preSum-1)));
                    break;
                }
            }
            else{
                preSum += t;
                t++;
            }


        }


    }
}



