public class removeDuplication {
    public static boolean[] map= new boolean[26]; 

    public static void duplicate(String str,int idx,String newStr){
       // base case
       if(str.length()==idx){
            System.out.println(newStr);
            return;
        }

       char curr=str.charAt(idx);

        if(map[curr - 'a']){
            duplicate(str, idx+1, newStr);
        }else{
            newStr+=curr;
            map[curr - 'a']=true;
            duplicate(str, idx+1, newStr);
        }

    }

    public static void main(String[] args){

        String str="anishsahaasmagupta";

        duplicate(str, 0, "");
  


    }

}
