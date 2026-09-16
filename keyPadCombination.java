public class keyPadCombination {
    public static String[] keyPad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keypad(String str,int idx,String combination){
        //base case
        if(str.length()==idx){
            System.out.println(combination);
            return;
        }
        char curr= str.charAt(idx);
        String mapping =  keyPad[curr - '0'];

        for(int i=0;i<mapping.length();i++){
            keypad(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        String str="23";
        keypad(str, 0, "");

    }
}
