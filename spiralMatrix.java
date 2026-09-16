import java.util.Scanner;

public class spiralMatrix {
    public static void main (String[] args){
        //variable declerataion
           int n,m;



        // input class
        Scanner sc = new Scanner(System.in);

        //taking rows and column
          System.out.print("enter the size of  rows");
            m=sc.nextInt();
            System.out.print("enter the size of  column");
            n=sc.nextInt();



            //making a matrix

            int matrix[][]=new int[m][n];


            //taking the input

            for(int i = 0;i<m;i++){
                for(int j=0;j<n;j++){
                  System.out.println("enter the elements");
                    matrix[i][j]=sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("successfully entered the elements in matrix");


            //for spiral part

            //decleration of variable

            int rowStart=0;

            int rowEnd=m-1;
            int colStart=0;
            int colEnd=n-1;

            //loop part
                System.out.println("the spiral elements are: ");
            while(rowStart<=rowEnd && colStart<=colEnd){
                //L-R

                for(int col=colStart;col<=colEnd;col++){
                    System.out.println(matrix[rowStart][col]+" ");
                }
                rowStart++;

                //R-B

                for(int row=rowStart;row<=rowEnd;row++){
                    System.out.println(matrix[row][colEnd]+" ");
                }
                colEnd--;

                //B-L
                     for(int col=colEnd;col>=colStart;col--){
                        System.out.println(matrix[rowEnd][col]+" ");
                           
                     }
                     rowEnd--;


                //L-Top

                for (int row=rowEnd;row>=rowStart;row--) {
                    System.out.println(matrix[row][colStart]+" ");
                    
                }
                      colStart++;

            }
    }
}
