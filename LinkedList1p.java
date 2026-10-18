
import java.util.*; 

public class LinkedList1p {
    public static void main(String [] args){
        // LinkedList <Integer> list =new LinkedList<>();

       //for input

       int a=5;
       int count =0;
       System.out.println((Integer.toBinaryString(a)));

    //    @SuppressWarnings("unused")
       String b= Integer.toBinaryString(a);
       

       
       for (int i =1;i<=b.length();i++){
                 if (b.charAt(i)=='1'){
                     count++;
                 }
       }
              System.out.println(count);
       
            

    }
}
