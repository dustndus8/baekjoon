import java.util.Scanner;

public class Main {

    static int k=0;
    static StringBuilder sb = new StringBuilder();

    public static void hanoi_tower(int n, int first, int second, int third){

        k++;
        if(n==1)
        {
            sb.append(first+" "+third+"\n");

        }

        else{
            hanoi_tower(n-1,first,third,second);
           sb.append(first+" "+third+"\n");
            hanoi_tower(n-1,second,first,third);

        }


    }

    public static void main(String[] args){

        int input;


        Scanner sc = new Scanner(System.in);

        input=sc.nextInt();


        hanoi_tower(input,1,2,3);   // 옮긴 횟수 출력
        System.out.println(k);
        System.out.println(sb);



    }
}
