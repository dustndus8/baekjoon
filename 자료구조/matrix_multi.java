import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        int N;
        int MA;
        int MB;
        int K;
        Scanner sc = new Scanner(System.in);

        // 행렬 A의 크기 N , MA 주어짐
       N=sc.nextInt();
       MA=sc.nextInt();

        int matrixA[][] = new int[N][MA];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<MA;j++)
            {

                matrixA[i][j] = sc.nextInt();
            };
        }

        MB=sc.nextInt();
        K=sc.nextInt();
        int matrixB[][] = new int[MB][K];
        for(int i=0;i<MB;i++)
        {
            for(int j=0;j<K;j++)
            {

                matrixB[i][j] = sc.nextInt();
            };
        }

        int[][] matrix_multiple = new int[N][K];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<K;j++)
            {
                for(int k=0;k<MB;k++)
                {
                    matrix_multiple[i][j]+= matrixA[i][k]*matrixB[k][j];
                }
            }
        }



        //출력
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<K;j++)
            {
                System.out.print(matrix_multiple[i][j]);
                System.out.print(' ');
            };
            System.out.println();
        }




    }
}
