import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char alpha_big[] = new char[26];   // 알파벳 대문자 배열
        for (int i = 0; i < 26; i++) {
            alpha_big[i] = (char) (65 + i);
        }

        char alpha_small[] = new char[26]; // 알파벳 소문자 배열
        for (int i = 0; i < 26; i++) {
            alpha_small[i] = (char) (97 + i);
        }

        int cnt_array[] = new int[26];    // 숫자 세는 배열

        String input = sc.next();
        char char_input;
        for (int i = 0; i < input.length(); i++) {
            char_input = input.charAt(i);
            for (int j = 0; j < 26; j++) {
                if (char_input == alpha_big[j] || char_input == alpha_small[j]) {
                    cnt_array[j] += 1;
                }
            }
        }

        int max = cnt_array[0];
        int same_max = 0;
        int max_index = 0;

        for (int i = 0; i < 25; i++) {
            if (max < cnt_array[i+1]) {
                max = cnt_array[i+1];
                max_index = i+1;
            }

        }

        for (int i = 0; i < 26; i++) {
            if(max == cnt_array[i])
            {
                same_max+=1;
            }
        }

            if(same_max>1)
            {
                System.out.print("?");
            }
            else
            {
                System.out.print(alpha_big[max_index]);
            }





    }


}
