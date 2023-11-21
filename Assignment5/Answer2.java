import java.util.Queue;

class LL{

    Node head  = null;
    Node tail = null;
    static private class Node{
        public int data;
        public Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void addFirst(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
        }else{
            Node curr = new Node(data);
            curr.next = head;
            head = curr;
        }
    }

    public int getHead() {
        return head.getData();
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getTail() {
        return tail.getData();
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void addLast(int data) {
        if(head == null){
            head = new Node(data);
            tail = head;
        }else{
            tail.next = (new Node(data));
            tail = tail.next;
        }
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("List empty");
            return -1;
        }
        int val = head.data;
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("List empty");
            return -1;
        }
        int val = tail.data;
        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node curr = head;
            while(curr.next != tail){
                curr = curr.next;
            }
            tail = curr;
        }
        return val;
    }

    public void display(){
        Node curr = head;
        while(curr!=null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

class Stack{
    LL stk;
    Stack(){
        stk = new LL();
    }

    void push(int val){
        stk.addFirst(val);
    }

    int pop(){
        return stk.removeFirst();
    }

    int peek(){
        return stk.getHead();
    }

}

class Que{
    LL que;

    Que(){
        que = new LL();
    }

    void enqueue(int val){
        que.addLast(val);
    }

    int dequeue(){
        return que.removeFirst();
    }

    int peek(){
        return que.getHead();
    }

}


public class Answer2 {
    public static void main(String[] args) {
        Stack q = new Stack();
        q.push(1);
        q.push(2);
        q.push(4);
        q.push(3);
        q.push(2);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
