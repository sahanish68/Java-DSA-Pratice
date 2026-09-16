//to ask a set of number in a array and find the match number in the array and print the index of the match number
import java.util.Scanner;

public class search_x {
    public static void main(String[] args){
        int row,column; 

        Scanner sc = new Scanner(System.in);

        //for rows
        System.out.print("enter the size of row ");
        row=sc.nextInt(); 

         // for column 
        System.out.print("enter the size of column ");
        column=sc.nextInt();  

       //for input
       int num[][]= new int[row][column];
       for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("enter the elements of "+(i+1)+"rows and "+(j+1)+"th column");
            num[i][j]=sc.nextInt();
            }

             
       }
       
       //for printing the Data

       for(int i=0;i<row;i++){
         for (int j=0;j<column;j++){
            System.out.print(num[i][j] + " "); 
         }
         System.out.println();
       }



       //to find the x element in array

       int find;
       System.out.println("enter the element to find in array");
       find=sc.nextInt();

       for(int i=0;i<row;i++){

                for(int j=0;j<column;j++){
                    if(num[i][j]==find){
                        System.out.println("the position of x is "+(i+1)+" row and "+(j+1)+" column"); 
                        break; 
                    } 
                }
       }

    } 
}