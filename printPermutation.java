public class printPermutation {

    public static void printPer(String str,String per ,int idx){
          if (str.length()==0){
            System.out.println(per);
            return;
          }
                for(int i=0;i<str.length();i++){
                    char currChar=str.charAt(i);
                    String newStr=str.substring(0,i)+str.substring(i+1);
                    printPer(newStr, per+currChar, i+1);
                }

    }
    public static void main(String[] args) {
        String str="ABCD";

        printPer(str, "", 0);
        
    }
}
