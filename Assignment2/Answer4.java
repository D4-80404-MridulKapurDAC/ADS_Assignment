
     class MyStack{
        public static final int size=5;
        int[] stack;
        int top;
        MyStack() {
            this.stack = new int[size];
            top=size;
        }
        public void push(int val){
            if(top==0){
                System.out.println("Stack is full");
            }
            else{
                stack[--top]=val;
                System.out.println(val +" inserted successfully");
            }
        }
        public int pop(){
            if(top==size){
                System.out.println("stack is empty");
            }
            int x=stack[top];
             stack[top++]=0;
             return x;
        }
        public void print(){
            for(int i=0;i<size;i++){
                System.out.print(" "+stack[i]);
            }
            System.out.println();
        }
    }

    public class Main {

    public static void main(String[] args) {
            MyStack s=new MyStack();
            s.push(1);
            s.push(2);
            s.push(3);
        s.print();
        System.out.println(s.pop());
            s.print();
    }
}