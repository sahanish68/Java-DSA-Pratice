
// import java.awt.desktop.SystemSleepEvent;

public class Queue {
    static class QueueY{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        QueueY(int n){
               arr=new int[n];
               this.size=n;
        }



        //empty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;

             //add function


        public static void add(int data){ 
            if (isFull()){
                System.out.println("Queue is fulled");
                return ;

            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }   
        
        //dequeue

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result=arr[front];
            
            if(front==rear){
                front=rear=-1;
            rear--;
            return front;

        }

        //peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }



    }




    public static void main(String [] args){
        
        QueueY q=new QueueY(5);
        q.add(1); 
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}

//debug 
