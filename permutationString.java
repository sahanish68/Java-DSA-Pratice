public class permutationString {
     public static void printPermutation(String str , String permu){

        if(str.length()==0){
            System.out.println(permu);
            return;
        }
       //loop to track the current element 
       for(int i = 0;i<str.length();i++){
            char curr= str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            //calling the function for next level

            printPermutation(newStr, permu+curr); 
        }
   }



    public static void main(String[] args){
        String str="abc";

        printPermutation(str, ""); 
     }

}
