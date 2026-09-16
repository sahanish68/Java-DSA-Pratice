
import java.util.Scanner;


// import java.awt.desktop.ScreenSleepListener;

public class reverseStringRecursion {
       public static void reverse(int n,String str){
        
                   if(n==0){
                    System.out.println(str.charAt(n));
                    return;
                   }
                    System.out.println(str.charAt(n));
            reverse(n-1, str);

       }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //taking input
            String str =sc.nextLine();

            reverse(str.length()-1, str);
    }
}
