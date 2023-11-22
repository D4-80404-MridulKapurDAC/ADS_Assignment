class BST{

    Node root;
    static final int COUNT = 10;
    static public class Node{
        public Node left;
        public Node right;
        public int data;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    void addNode(int val){
        addNode(root,val);
    }
    void addNode(Node curr,int val){
        if(root == null){
            root = new Node(val);
        }else{
            if(curr.data >= val){
                if(curr.left != null){
                    addNode(curr.left,val);
                    return;
                }
                curr.left = new Node(val);
            }else{
                if(curr.right!=null){
                    addNode(curr.right,val);
                    return;
                }
                curr.right = new Node(val);
            }
        }
    }

    int depth(Node curr){
        if(curr == null)return 0;
        return Math.max(depth(curr.left),depth(curr.right)) +1;
    }

    static void print2DUtil(Node root, int space) {
        if (root == null)
            return;
        space += COUNT;
        print2DUtil(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");
        print2DUtil(root.left, space);
    }
    void print2D(){
        print2DUtil(root, 0);
    }

    boolean search(int val){
        return search(root,val);
    }

    boolean search(Node curr, int val){
        if(curr == null)return false;
        if(curr.data == val){
            return true;
        }else if(val < curr.data){
            return search(curr.left,val);
        }else{
           return search(curr.right,val);
        }
    }

}

public class Answer45 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.addNode(10);
        tree.addNode(1);
        tree.addNode(4);
        tree.addNode(5);
        tree.addNode(11);
        tree.addNode(15);
        tree.addNode(-1);
        System.out.println(tree.search(6));
    }
}
