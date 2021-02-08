import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int sum = 0;
        int dayCount = (v - b) / (a - b);   // 정상에 도달하면 미끄러지지않기 때문에 분자가 v-b

        if((v - b) % (a - b) !=0)   // 잔여 블록이 있을때
        {
            dayCount++;
        }
        System.out.println(dayCount);


    }
}



