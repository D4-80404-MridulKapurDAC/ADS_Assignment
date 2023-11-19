class MyQueue{
    public static final int size=5;
    private int[] q;
    private  int front;
    private int rear;
    MyQueue(){
        q=new int[size];
        front=0;
        rear=0;
    }
    public  void enqueue(int val){
        if(rear==size){
            System.out.println("Queue is full...");
        }else{
            q[rear++]=val;
        }
    }
    public void dequeue(){
        if(front==size || front>rear){
            System.out.println("Queue is empty...");
        }else{
            System.out.println("Ans : "+q[front]);
            q[front]=0;
            front++;
        }

    }
    public void print(){
        for (int j : q) {
            System.out.print(j+" ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyQueue que=new MyQueue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.print();
        que.dequeue();
        que.print();
        que.dequeue();
        que.print();
        que.dequeue();
        que.print();
        que.dequeue();
        que.print();
        que.dequeue();
        que.print();
        que.dequeue();
        //que.print();

    }
}