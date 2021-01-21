import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        input = sc.nextLine().trim();   //trim은 문자열 앞 뒤 공백 제거

        String[] array = input.split("\\s");

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.print(array.length);
        }
    }


}
