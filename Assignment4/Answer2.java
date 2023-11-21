class CLL {
    Node tail;
    static private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
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
        if(tail == null){
            tail = new Node(data);
            tail.setNext(tail);
        }else{
            Node curr = new Node(data);
            curr.setNext(tail.getNext());
            tail.setNext(curr);
        }
    }

    public void addLast(int data) {
        if(tail == null){
            tail = new Node(data);
            tail.setNext(tail);
            tail = tail.getNext();
        }else{
            Node curr = new Node(data);
            curr.setNext(tail.getNext());
            tail.setNext(curr);
            tail = tail.getNext();
        }
    }

    public int removeFirst(){
        if(tail == null){
            System.out.println("List empty");
            return -1;
        }
        int val = tail.getNext().getData();
        if(tail.getNext() == tail){
            tail = null;
        }else{
            tail.setNext(tail.getNext().getNext());
        }
        return val;
    }

    public int removeLast(){
        if(tail == null){
            System.out.println("List empty");
            return -1;
        }
        int val = tail.getData();
        if(tail.getNext() == tail){
            tail = null;
        }else{
            Node curr = tail;
            while(curr.getNext() != tail){
                curr = curr.getNext();
            }
            curr.setNext(tail.getNext());
            tail = curr;
        }
        return val;
    }

    public void display(){
        if(tail==null)return;
        Node curr = tail.getNext();
        while(curr!=tail) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
        System.out.println(curr.getData());
    }

}
public class Answer2 {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
//        list.addFirst(15);
//        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(15);
//        list.removeLast();
//        list.removeFirst();
//        list.removeLast();
//        list.removeFirst();
//        list.removeLast();
//        list.removeFirst();
//        list.removeLast();
//        list.removeFirst();
        list.display();
    }
}
