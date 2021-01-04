import java.util.Scanner;

public class Main {
    public static void less_than_x(int n, int x, int a[]){

        for(int i=0;i<n;i++)
        {
            if(a[i]<x)
                System.out.print(a[i]+" ");

        }

    }




    public static void main(String[] args) {

        int n, x; // n:수열이 정수 n개로 주어짐, x:비교대상

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        less_than_x(n,x,arr);



    }
}
