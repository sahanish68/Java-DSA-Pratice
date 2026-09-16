import java.util.HashSet;
public class uniqueSubSequence {
      public static void sequence(String str,int idx,String newStr,HashSet <String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
           
           
        
        }
        char curr = str.charAt(idx);
        //to do
        sequence(str, idx+1, newStr+curr,set);

        //to not come
        sequence(str, idx+1, newStr,set);

      }

      public static void main(String[] args){
        String str="aaa";
        //hashSet
        HashSet <String> set= new HashSet <>();


        sequence(str, 0, "",set); 

      }


}
