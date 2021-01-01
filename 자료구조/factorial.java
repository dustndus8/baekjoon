import java.util.Scanner;

class Main {

    public static int factorial(int n)
    {
        if(n<=1)
            return (1);
        else
            return (n* factorial(n-1));
    }

    public static void main(String args[]){

        int input;

        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        System.out.println(factorial(input));

    }
}
