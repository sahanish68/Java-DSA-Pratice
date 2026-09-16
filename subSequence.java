public class subSequence {
      public static void sequence(String str,int idx,String newStr){
        if(idx==str.length()){
           System.out.println(newStr);
           return;
        
        }
        char curr = str.charAt(idx);
        //to do
        sequence(str, idx+1, newStr+curr);

        //to not come
        sequence(str, idx+1, newStr);

      }

      public static void main(String[] args){
        String str="abcdefghij";

        sequence(str, 0, "");

      }


}
