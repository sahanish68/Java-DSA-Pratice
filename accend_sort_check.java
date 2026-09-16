
import java.util.Scanner;


public class accend_sort_check {
    public static void main(String[] args) {
        int size;
        
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the length of array");
       size =sc.nextInt();
        int number[]=new int [size]; 
       //make a array of it

       for(int i=0;i<size;i++){
             System.out.println("enter the value for "+i+" index");
             number[i]=sc.nextInt(); 
       }

       //to sort them
       boolean isAccend = true; 
       for(int i=0;i<size-1;i++){ 
       
        if(number[i]>number[i+1]){
           
            isAccend=false;
        }
       }
       if(isAccend) { 
        System.out.println("array is in accending order");
       }else{
       System.out.println("decending");  
       }

    }
}

