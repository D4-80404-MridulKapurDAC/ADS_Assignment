class DCLL{
    Node tail;
    int len = 0;
    static class Node{
        public Node next;
        public Node prev;
        public int data;
        Node(int data){
            this.data = data;
            next=null;
            prev=null;
        }
    }
    DCLL(){
        tail = null;
    }

    void addFirst(int data){
        len++;
        if(tail == null){
            tail = new Node(data);
            tail.next = tail;
            tail.prev = tail;
        }else{
            Node curr = new Node(data);
            curr.next = tail.next;
            curr.prev = tail;
            tail.next.prev = curr;
            tail.next = curr;
        }
    }

    void addLast(int data){
        len++;
        if(tail == null){
            tail = new Node(data);
            tail.next = tail;
            tail.prev = tail;
        }else{
            Node curr = new Node(data);
            curr.next = tail.next;
            curr.prev = tail;
            tail.next.prev = curr;
            tail.next = curr;
            tail = tail.next;
        }
    }

    void removeFirst(){
        if(tail == null){
            System.out.println("No nodes.");
            return;
        }
        len--;
        if(tail.next == tail){
            tail = null;
        }else{
            tail.next = tail.next.next;
            tail.next.prev = tail;
        }
    }

    void removeLast(){
        if(tail == null){
            System.out.println("No nodes.");
            return;
        }
        len--;
        if(tail.next == tail){
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = tail.next.next;
            tail.next.prev = tail;
        }
    }

    void addAt(int pos,int val){
        if(pos > len+1){
            System.out.println("invalid pos.");
            return;
        }
        if(pos == len+1){
            addLast(val);
            return;
        }
        Node curr = tail;
        Node toAdd = new Node(val);
        while(--pos > 0){
            curr = curr.next;
        }
        toAdd.next = curr.next;
        toAdd.prev = curr;
        curr.next.prev = toAdd;
        curr.next = toAdd;
        len++;
    }

    void removeAt(int pos){
        if(pos > len){
            System.out.println("invalid pos.");
            return;
        }
        if(pos == len){
            tail = tail.prev;
            Node curr = tail;
            curr.next.next.prev = curr;
            curr.next = curr.next.next;
            return;
        }
        Node curr = tail;
        while(--pos > 0){
            curr = curr.next;
        }
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        len--;
    }
    void display(){
        if(tail == null){
            System.out.println("No nodes");
        }
        Node curr = tail.next;
        while(curr != tail){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
}

public class Answer1 {
    public static void main(String[] args) {
        DCLL list = new DCLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
//        list.addLast(10);
//        list.addLast(11);
//        list.addLast(12);
//        list.addLast(13);
//        list.addLast(14);
        list.addAt(1,69);
        list.removeAt(7);
        list.display();
    }
}
