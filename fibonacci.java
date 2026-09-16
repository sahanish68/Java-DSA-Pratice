
import java.util.Scanner;

public class fibonacci {
    public static void printSeq(int a,int b,int num ,int i){
        if(num==i){
            return;
        }
       int c=a+b;
        System.out.println(c);
        //swap
        a=b;
        b=c;
        printSeq(a, b, num,i+1);

    }

    public static void main(String[] args){
        int num;
        int a=0;
        int b=1;
        Scanner sc= new Scanner (System.in);
        System.out.print("enter the number upto which you wnat to print series:");
        num=sc.nextInt();
            //    System.out.print(b);

        //calling the function

        printSeq(a, b, num,1);

    }
}
