import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        int input;

        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();

        //나이, 이름, 입력순서 배열
        String[][] arr = new String[input][2];

        for(int i=0;i<input;i++)
        {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();

        }

        Arrays.sort(arr,new Comparator<String[]>(){
            @Override
                    public int compare(String[] s1, String[] s2){
                return Integer.compare(Integer.parseInt(s1[0]),Integer.parseInt(s2[0]));
            }
        });

        for(int i=0;i<input;i++)
        {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }



    }
}
