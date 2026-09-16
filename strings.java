import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String enter="";
         String res="";
        Scanner sc= new Scanner(System.in);

        System.out.println("enter any word containing e");
        enter=sc.next();



        // to change

        for(int i=0;i<enter.length();i++){
            if (enter.charAt(i)=='e' || enter.charAt(i)=='E'){
                     res=res+'i';
            }else{
                res=res+enter.charAt(i);
            }
        }
        System.out.println(res);

    } 
}
