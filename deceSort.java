public class deceSort {
      public static void main(String[] args){
        int a=5;
        int b=7;

        //swap using bit

       

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
      }
}
