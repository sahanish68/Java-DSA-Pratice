
    
import java.util.Scanner;

public class xPowerLogn {
    public static int  calcPower(int x,int n){
         if (n==0){
            return 1;
         }
         if (x==0){
            return 0;
         }
         

         //checking odd or even

         //if even
         if(n%2==0){
            return calcPower(x, n/2)* calcPower(x, n/2);
         }else{

            return calcPower(x, n/2)*calcPower(x, n/2)*x;
         }


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