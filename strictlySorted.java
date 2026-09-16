
import java.util.Scanner;

public class strictlySorted {
    public static boolean  sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return sorted(arr, i+1);
        }else{
            return false;
        }
              
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
              System.out.println("enter the size of aaray");
              int size;
              size= sc.nextInt();

              int arr[]= new int [size];

              //to take element in array

              for(int i=0;i<size;i++){
                System.out.println("enter the element of "+(i+1)+" term.");
                arr[i]=sc.nextInt();
              }

             System.out.println(sorted(arr, 0));  
              

    }
    
}
