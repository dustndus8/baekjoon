

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n=sc.nextInt();
        String a;
        a=sc.next();
        String [] array;

        array=a.split("");
        int sum=0;
        for(int i=0;i< array.length;i++)
        {
            sum += Integer.parseInt(array[i]);
        }

        System.out.print(sum);






}}
