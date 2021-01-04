import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int real_input;
        int input;
        int hap=0;

        int left,right;
        int new_number=0;

        int count=0;

        Scanner sc = new Scanner(System.in);

        real_input=sc.nextInt();

        input=real_input;

        while(true)
        {

            if(input<10)
            {
                hap=0+input;
                right=input;

                new_number=right*10 + hap;
                input=new_number;
            }

            else { left = input/10;
            right = input%10;

            hap = left+right;
            new_number = right*10 + (hap%10);

            input = new_number;
            }

            count++;

            if(real_input==new_number)
                break;
        }

        System.out.print(count);

        }






    }
