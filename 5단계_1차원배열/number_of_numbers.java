import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i=0;

        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int mul;
        mul=a*b*c;

        int spl[]=new int[10];
        int cnt[]=new int[10];


        while(mul > 0)
        {
                spl[i]=mul%10;
                mul = mul / 10;

                for(int j=0;j<10;j++)
                {
                    if(spl[i] == j)
                    {
                        cnt[j] += 1;
                    }
                }

            i++;

        }

        for(int k=0;k<10;k++)
            System.out.println(cnt[k]);




    }
}
