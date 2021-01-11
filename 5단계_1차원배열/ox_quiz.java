import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int o_cnt=0;
        int sum=0;

        n=sc.nextInt();
        String array[]=new String[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.next();
        }

        for(int i=0;i<n;i++)
        {
            String[] strArray=array[i].split("");

            for(String s : strArray){
                if(s.equals("O"))
                {
                    o_cnt+=1;
                    sum += o_cnt;
                }
                else
                    o_cnt=0;

            }

            System.out.println(sum);
            o_cnt=0;
            sum=0;

        }








}}
