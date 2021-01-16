import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] rema = new int[42];
        int count_what=0;
        for(int i=0;i<=41;i++)
        {
            rema[i]=i;
        }

        int[]cnt = new int[42];

        for (int i = 0; i < 10; i++) {
            int inp = sc.nextInt();

            for (int j = 0; j <= 41; j++) {
                if (inp % 42 == rema[j]) {
                    cnt[j]+=1;
                }

            }

        }
        for(int i=0;i<=41;i++)
        {if(cnt[i]!=0)
        {
            count_what+=1;
        }
        }

        System.out.print(count_what);




    }


}
