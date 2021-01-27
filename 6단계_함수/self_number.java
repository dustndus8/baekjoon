import java.util.Scanner;

public class Main {
    public static int self_number(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = 10000;
        boolean[] tmp = new boolean[limit];

        for (int i = 1; i < limit; i++) {
            if(self_number(i) <= limit)
            {
             tmp[self_number(i)-1]=true;
            }
        }

        for (int j = 0; j < limit; j++) {
            if(tmp[j] == false)
            {
                System.out.println(j+1);
            }
        }


    }

}
