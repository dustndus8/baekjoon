import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double sum=0;
        double ave=0;
        double cnt=0;



        for(int i=0;i<n;i++)
        {
            int numb;
            numb=sc.nextInt();

            double score[]=new double[numb];
            for(int j=0;j<numb;j++)
            {
                score[j]=sc.nextDouble();
                sum+=score[j];
            }

            ave=sum/numb;

            for(int k=0;k<numb;k++)
            {
                if(ave < score[k])
                {
                    cnt++;
                }
                else
                    continue;
            }
            System.out.println(String.format("%.3f",cnt/numb*100)+"%");
            sum=0;
            ave=0;
            cnt=0;



        }










    }


}
