
import java.util.Scanner;

public class bitManipulation {
    public static void main (String[] args){

        //varible decleration
                    int  n;
                    int position;
    
          //to get an number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        n=sc.nextInt();

        //finding the positon 
        System.out.println("entre the position which you want to get power of 2 or not::");
            position=sc.nextInt();

        //bit manipulation

        // int n=501;   //101 
        // int pos=4; 


        int bitMask=1<<position;
        if((bitMask & n)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }

    }
}
