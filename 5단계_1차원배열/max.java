import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int arr[]=new int[9];
        int arr_cnt[]=new int[9];

        for(int i=0;i<9;i++)
        {
            arr[i]=sc.nextInt();
            arr_cnt[i]=i+1;
        }


        int max = arr[0];
        int cnt=1;

        for(int i=1;i<9;i++){
            if(max<arr[i])
            {
                max=arr[i];
                cnt = arr_cnt[i];
            }
        }

        System.out.println(max);
        System.out.println(cnt);










    }
}
