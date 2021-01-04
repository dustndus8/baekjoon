import java.util.Scanner;

public class Main {

    public static void max_min(int[] ar, int n){

       int min=ar[0];
       int max=ar[0];

        for(int i=1;i<n;i++)
        {
            if(max < ar[i])
            {
                max = ar[i];
            }

            if(min > ar[i])
            {
                min = ar[i];
            }

        }


        System.out.print(min+" "+max);

    }

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        int ar[] = new int[n];

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        max_min(ar,n);


    }
}
