

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n=sc.nextInt();

        double array[]=new double[n];

        for(int i=0;i<n;i++) {
            array[i]=sc.nextDouble();
        }

        double m=array[0];

        for(int i=1;i<n;i++)
        {
            if(m<array[i])
            {
                m=array[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            array[i]=array[i]/m*100;
        }

        double sum=0;

        for(int i=0;i<n;i++)
        {
            sum += array[i];
        }

        System.out.print(sum/n);








}}
