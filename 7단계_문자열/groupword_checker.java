import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int word_cnt=n;

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            boolean[] check = new boolean[26];

            if(input.length()==1) {
                continue;
            }
            else    // input이 한글자 이상일때
            {
                for (int k = 1; k < input.length(); k++) {
                   if(input.charAt(k-1)!= input.charAt(k) )
                   {
                       if(check[input.charAt(k)-97] == true)
                       {
                           word_cnt--;
                           break;
                       }
                       check[input.charAt(k-1)-97]=true;
                   }

                }



            }

        }

        System.out.println(word_cnt);


    }

}
