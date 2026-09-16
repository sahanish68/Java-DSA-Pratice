
import java.util.Scanner;

public class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero");
        }
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

       //to take a input
       int a,b;
       int choice;

       System.out.println("here is the calulator for 2 number only");
       System.out.println();
       System.out.println(".....................................");
       System.out.print("enter any number");
       a= sc.nextInt();

       System.out.print("enter any number");
       b= sc.nextInt();

       do{
           System.out.println("1.addition");
           System.out.println("2.subtraction");
           System.out.println("3.multiplication");
           System.out.println("4.division");
           System.out.println("5.power");
           System.out.println("6.modulus");
           System.out.println("7.square");
           System.out.println("8.exit");

           System.out.print("enter your choice::");
           choice=sc.nextInt();

           calculator cal= new calculator();
           switch (choice){
               case 1:
                   System.out.println(cal.add(a,b));
                   break;
               case 2:
                   System.out.println(cal.subtract(a,b));
                   break;
               case 3:
                   System.out.println(cal.multiply(a,b));
                   break;
               case 4:
                   System.out.println(cal.divide(a,b));
                   break;
               case 5:
                   System.out.println(cal.power(a,b));
                   break;
               case 6:
                   System.out.println(cal.modulus(a,b));
                   break;
               case 7:
                   System.out.println(cal.square(a));
                   break;
               case 8:
                   System.exit(0);
               default:
                   System.out.println("invalid input");
           }
        }while (choice!=8);  
     
       
    }
    //debug 

}
