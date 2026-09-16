public class numberToCallGuest {
    public static int Total(int n){
        //base case
        if(n<=1){
            return 1;
        }
        //single guest
        int way1= Total(n-1);
        
        //pair
        int way2 =(n-1)*Total(n-2);
        return way1 + way2; 

    }
    public static void main(String[] args){
        int n=3; 
        System.out.println(Total(n)); 

    }
}
