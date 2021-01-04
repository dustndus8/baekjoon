import java.util.Scanner;

public class Test {

    public static int choose_quadrant(int x, int y){

        if(x>0 && y>0)
            return 1;
        else if(x<0 && y>0)
            return 2;
        else if(x<0 && y<0)
            return 3;
        else if(x>0 && y<0)
            return 4;
        else
            return 0;

    }


    public static void main(String[] args){

        int x, y ;

        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.print(choose_quadrant(x,y));

    }
}
