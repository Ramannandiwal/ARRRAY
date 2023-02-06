import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the nubmers of the rows ");
        int rows = sc.nextInt();
        System.out.println("enter the nubmer of the coliums ");
        int col = sc.nextInt();
        int arr1[][]=new int[rows][col];
        for(int i = 0;i<rows;i++){
            for (int j = 0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        //
        System.out.println("enter the nubmers of the rows of the second array ");
        int row1 = sc.nextInt();
        System.out.println("enter the nubmer of the coliums of second array  ");
        int col1 = sc.nextInt();
        int arr2[][]=new int[row1][col1];
        for(int i = 0;i<row1;i++){
            for (int j = 0;j<col1;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
    int arr3[][]= new int[row1][col1];
        for(int i =0;i<row1;i++){
            for(int j  =0;j<col1;j++){
                arr3[i][j]=0;
                for (int k = 0; k <col1 ; k++) {
                    arr3[i][j]=   arr3[i][j]+arr1[i][k]*arr2[k][j];
                }


            }
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(" "+arr3[i][j]);

            }
            System.out.println();
        }

    }
}
