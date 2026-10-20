
import java.util.*;

public class Stack_Arraylist {
    static class StackClass{
      static ArrayList <Integer> list =new ArrayList<>();

        //empty check
      @SuppressWarnings("SizeReplaceableByIsEmpty")
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push function
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }


    public static void main(String [] args){
         StackClass.push(1); 
            StackClass.push(2); 
            StackClass.push(3); 
            StackClass.push(4); 

        while(!StackClass.isEmpty()){
            System.out.println(StackClass.peek());
            StackClass.pop();
        }    

    }
    
}
