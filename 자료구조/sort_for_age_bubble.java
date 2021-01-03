import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort_for_age(int[] a, String[] n, int[] c, int inp){

        for(int i=0;i<inp;i++)
        {
            for(int j=0;j<inp-i-1;j++)
            {
               if(a[j] > a[j+1])
               {
                   int tmp_a = a[j+1];
                   a[j+1] = a[j];
                   a[j] = tmp_a;

                   String tmp_n = n[j+1];
                   n[j+1] = n[j];
                   n[j] = tmp_n;

                   int tmp_c = c[j+1];
                   c[j+1] = c[j];
                   c[j] = tmp_c;
                   //Arrays.sort(int_s);
               }
               //나이 같으면 먼저 입력한 게 먼저
               else if(a[j]==a[j+1])
               {
                   if( c[j] > c[j+1])
                   {
                       int tmp_a = a[j+1];
                       a[j+1] = a[j];
                       a[j] = tmp_a;

                       String tmp_n = n[j+1];
                       n[j+1] = n[j];
                       n[j] = tmp_n;

                       int tmp_c = c[j+1];
                       c[j+1] = c[j];
                       c[j] = tmp_c;
                   }

               }

            }
        }

        StringBuilder sb = new StringBuilder();

        // 출력
        for(int i=0;i<inp;i++)
        {
            System.out.print(a[i]+""+n[i]+"\n");
        }

    }




    public static void main(String[] args){
        int input;

        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();

        //나이, 이름, 입력순서 배열
        int[] age = new int[input];
        String[] name = new String[input];
        int[] count = new int[input];


        for(int i=0;i<input;i++)
        {
            age[i] = sc.nextInt();
            name[i] = sc.next();
            count[i] = i;
        }

      sort_for_age(age,name,count,input);







    }
}
