import java.util.Stack;

public class Stack {
    static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            next=null;
        }

    }


    static class StackClass{
        public static Node head;


        public static boolean isEmpty(){
            return head==null;  
        }

        public static void push(int data){
             Node newNode =new Node(data);
               if(isEmpty()){
                  head=newNode;
                  return;
                 }
              newNode.next=head;
              head=newNode;



        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int pop=head.data;
            head=head.next;
            return pop;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return head.data;

        }

    }
    public static void main(String[] args) {
            // StackClass s=new Stack();
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
