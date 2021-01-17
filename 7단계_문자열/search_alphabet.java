import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] strChar = new char[input.length()];
        char[] alpha = new char[26];
        int[] alpha_cnt = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha_cnt[i]=-1;
        }
        int[] input_index = new int[input.length()];

        for (int i = 0; i < 26; i++) {  // 알파벳 배열에 a~z까지 넣기
            alpha[i] = (char) (97 + i);
        }
        for (int i = 0; i < input.length(); i++) {
            input_index[i]=i;
        }

        for (int i = 0; i < input.length(); i++) {

            strChar[i] = input.charAt(i);

            for (int j = 0; j < 26; j++) {
                if (alpha[j] == strChar[i]) {
                    if(alpha_cnt[j]==-1)
                    {alpha_cnt[j]=input_index[i];}

                }

            }


        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha_cnt[i]+" ");
        }






    }


}
