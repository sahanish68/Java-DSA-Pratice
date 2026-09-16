
import java.util.Scanner;

public class factorialRecursion {
    public static void printFactorial(int i,int n,int sum){
        if(i==n){
            sum=sum*i;
            System.out.println(sum);
            return;
        }

        sum=sum*i;
        printFactorial(i+1,n,sum); 
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("enter the number you want to calculate factorial:");
        n=sc.nextInt();

        printFactorial(1,n,1);



    }
}
