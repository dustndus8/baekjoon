

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        int a=sc.nextInt();
        int b=sc.nextInt();

        sc.close();

        a=Integer.parseInt(sba.append(a).reverse().toString());
        b=Integer.parseInt(sbb.append(b).reverse().toString());

        System.out.print(a>b?a:b);





}}
