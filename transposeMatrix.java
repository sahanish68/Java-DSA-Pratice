
import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        
        int row, column;

        Scanner sc = new Scanner(System.in);

        //for rows
        System.out.print("enter the size of row ");
        row = sc.nextInt();

        // for column
        System.out.print("enter the size of column ");
        column = sc.nextInt();

        //for input
        int num[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("enter the elements of " + (i + 1) + "rows and " + (j + 1) + "th column");
                num[i][j] = sc.nextInt();
            }
        }


        // for traspose


        // row ==> column
        // column ==> row
        // int temp[][]=new int[column][row];
           System.out.println("transpose of matrix is: ");
        for (int j=0;j<column;j++){
            for(int i=0;i<row;i++){
                    System.out.print(num[i][j]);
            }  
            System.out.println();    
          }

    }
}
