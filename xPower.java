
import java.util.Scanner;

public class xPower {
    public static int  calcPower(int x,int n){
         if (n==0){
            return 1;
         }
         if (x==0){
            return 0;
         }
         int xPown1=calcPower(x, n-1);
         int xPow=x*xPown1;

         return xPow;


    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the base number:");
        int x=sc.nextInt();
        System.out.print("enter the number you want to raise up:");
        int n=sc.nextInt();

        int res= calcPower(x, n);
        System.out.println(res);


        

    }
    
}
