
class LL{

    Node head  = null;
    Node tail = null;
    static private class Node{
        int data;
        Node next;

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
            curr.setNext(head);
            head = curr;
        }
    }

    public void addLast(int data) {
        if(head == null){
            head = new Node(data);
            tail = head;
        }else{
            tail.setNext(new Node(data));
            tail = tail.getNext();
        }
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("List empty");
            return -1;
        }
        int val = head.getData();
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.getNext();
        }
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("List empty");
            return -1;
        }
        int val = tail.getData();
        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node curr = head;
            while(curr.getNext() != tail){
                curr = curr.getNext();
            }
            tail = curr;
        }
        return val;
    }

    public void display(){
        Node curr = head;
        while(curr!=null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}

public class Answer1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(15);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(15);
        list.removeLast();
        list.removeFirst();
        list.removeLast();
        list.removeFirst();
        list.removeLast();
        list.removeFirst();
        list.removeLast();
        list.removeFirst();
//        System.out.println(list.tail.getData());
        list.display();
    }
}
