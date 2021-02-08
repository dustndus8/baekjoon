import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int range = 1;
        int check = 0;
        int j = 1;

        if (n == 1) {
            System.out.println(1);
        } else if (n > 1) {
            count = 2;

            while (range != n) {
                for (int i = 0; i < 6 * j; i++) {
                    range += 1;

                    if (range == n) {
                        System.out.println(count);
                        break;
                    }
                }
                count++;
                j++;
            }
        }

    }


}



