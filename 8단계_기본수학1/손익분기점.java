import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c<=b) {  //손익분기점이 존재하지 않음
            System.out.println(-1);
        } else {
            System.out.println(a/(c-b)+1);
        }

    }
}


