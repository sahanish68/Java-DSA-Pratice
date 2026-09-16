public class selectionSort {
    public static void main(String[] args){
        

       int arr[]={5,6,7,1,0,2};

       System.out.println(arr[3]);

       for(int i=0;i<arr.length;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        //swap
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
       }
       
       //to print 
           System.out.println("...................................");
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

    }
}
