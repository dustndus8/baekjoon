import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] input_array = new char[input.length()];
        //문자열 하나씩 자르기
        for (int j = 0; j < input.length(); j++) {
            input_array[j] = input.charAt(j);
        }


        int word_cnt = 0;
        for (int i = 0; i < input_array.length; i++) {

            if (input_array[i] == 'c') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == '=') {
                        i++;

                    } else if (input_array[i + 1] == '-') {
                        i++;
                    }
                }
            } else if (input_array[i] == 'd') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == 'z') {
                        if (i < input_array.length - 2) {
                            if (input_array[i + 2] == '=') {

                                i += 2;

                            }
                        }
                    } else if (input_array[i + 1] == '-') {

                        i++;

                    }
                }
            } else if (input_array[i] == 'l') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == 'j') {

                        i++;

                    }
                }
            } else if (input_array[i] == 'n') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == 'j') {

                        i++;

                    }
                }
            } else if (input_array[i] == 's') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == '=') {

                        i++;

                    }

                }
            } else if (input_array[i] == 'z') {
                if (i < input_array.length - 1) {
                    if (input_array[i + 1] == '=') {

                        i++;

                    }

                }
            }
            word_cnt++;


        }

        System.out.println(word_cnt);


    }

}
