
import java.util.Scanner;

public class reverseString {
    public static int start=-1;
    public static int end=-1;

          public static void reverse(String str,int n,char find){

            

            if (str.length()==n){  //base case
                
                return;
            }
            if(str.charAt(n)==find){
                if(start==-1){
                    start=n;
                }else{
                          end = n;
                }

            }
               reverse(str, n+1, find);


          }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the string");

        String str= sc.nextLine();
        System.out.println("enter the character you want to find index");
        char find='a';

        reverse(str, 0,find);
        System.out.println("first occurance is :"+start+" ");
        System.out.println("last occurance is :"+end+" ");


    }
}
