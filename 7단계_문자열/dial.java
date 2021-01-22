import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int min_time = 0;
        char []input_array = new char[input.length()];
        //문자열 하나씩 자르기
        for (int i = 0; i < input.length(); i++) {
            input_array[i] = input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++) {
            if(input_array[i]=='A'||input_array[i]=='B'||input_array[i]=='C')
            {
                min_time += 3;
            }
            else if (input_array[i]=='D'||input_array[i]=='E'||input_array[i]=='F')
            {
                min_time+=4;
            }
            else if(input_array[i]=='G'||input_array[i]=='H'||input_array[i]=='I')
            {
                min_time+=5;
            }
            else if(input_array[i]=='J'||input_array[i]=='K'||input_array[i]=='L'){
                min_time+=6;
            }
            else if(input_array[i]=='M'||input_array[i]=='N'||input_array[i]=='O'){
                min_time+=7;
            }
            else if(input_array[i]=='P'||input_array[i]=='Q'||input_array[i]=='R'||input_array[i]=='S'){
                min_time+=8;
            }
            else if(input_array[i]=='T'||input_array[i]=='U'||input_array[i]=='V'){
                min_time+=9;
            }
            else{
                min_time+=10;
            }
        }

        System.out.println(min_time);


    }

}
