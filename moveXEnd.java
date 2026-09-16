public class moveXEnd {

    public static void moveToEnd(String str, int idx,int count,String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
          System.out.println(newstr);
           return;
         }

     char currStr=str.charAt(idx);
            if(currStr=='x' || currStr=='X'){
                count++;
                moveToEnd(str, idx+1, count, newstr);
            }else{
                newstr +=currStr;
                moveToEnd(str, idx+1, count, newstr);
            }

    }

    public static void main(String[] args){

        String str= "abxxdcxf";

        moveToEnd(str, 0, 0, "");





    }
}
