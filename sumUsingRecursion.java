
import java.util.Scanner;

public class sumUsingRecursion {
    public static void myname(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println("Sum of numbers upto "+n +" is :"+sum+" ");
            return;
        }
        
        
       sum=sum+i;
       myname(i+1, n, sum);
        
        
    }

    public static void main(String[] args){
              int n;
              System.out.print("enter the number u want to add :");
              Scanner sc= new  Scanner(System.in);

              n=sc.nextInt();

              myname(1, n, 0);

              


    }
}
