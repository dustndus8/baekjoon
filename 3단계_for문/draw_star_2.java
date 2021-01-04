import java.util.Scanner;

public class Main {
    public static void draw_star_2(int n){

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }


    }


    public static void main(String[] args){

        int input;
        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();

        draw_star_2(input);


    }
}
