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

    boolean findParent(int val){
        return findParent(root,val);
    }
    boolean findParent(Node curr , int val){
        if(curr == null)return false;
        if(curr.data == val){
            System.out.println("Null");
            return true;
        }
        if(curr.left!=null && curr.left.data == val){
            System.out.println(curr.data);
            return true;
        }
        if(curr.right!=null && curr.right.data == val){
            System.out.println(curr.data);
            return true;
        }
        if(val < curr.data)
            return findParent(curr.left,val);
        return findParent(curr.right,val);
    }

    void printChildren(int val){
        printChildren(root,val);
    }
    void printChildren(Node curr,int val){
        if(curr.data == val){
            if(curr.left != null){
                System.out.println(curr.left.data);
            }
            if(curr.right != null){
                System.out.println(curr.right.data);
            }
        }
        if(val < curr.data)
            printChildren(curr.left,val);
        printChildren(curr.right,val);
    }


    void printSiblings(){
        printSiblings(root);
    }

    void printSiblings(Node curr){
        if(curr == null) return;
        if(curr.left!=null && curr.right!=null){
            System.out.println(curr.right.data);
            System.out.println(curr.left.data);
        }
        printSiblings(curr.left);
        printSiblings(curr.right);
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

    int leafNodes(){
        return leafNodes(root);
    }
    int leafNodes(Node curr){
        if(curr == null)return 0;
        if(curr.left == null && curr.right == null){
            return 1;
        }
        return leafNodes(curr.left) + leafNodes(curr.right);
    }

    int level(int val){
        return level(root,0,val);
    }
    int level(Node curr,int lvl,int val){
        if(curr == null)return -1;
        if(curr.data == val){
            return lvl;
        }if(curr.data < lvl){
            return level(curr.left,lvl+1,val);
        }
        return level(curr.right,lvl+1,val);
    }

    int NonleafNodes(){
        return NonleafNodes(root);
    }
    int NonleafNodes(Node curr){
        if(curr == null)return 0;
        if(curr.left == null && curr.right == null){
            return 0;
        }
        return leafNodes(curr.left) + leafNodes(curr.right) +1;
    }

    boolean delete(int val){
        return delete(null,root,val);
    }
    boolean delete(Node parent ,Node curr , int val){
        if(curr == null)return false;
        if(curr.data == val){
            Node toSetParent = curr;
            Node toSet = curr.right;
            if(toSet.left == null){
                curr.data = toSet.data;
                curr.right = null;
                return true;
            }
            while(toSet.left != null){
                toSetParent = toSet;
                toSet = toSetParent.left;
            }
            toSetParent.left = toSet.right;
            curr.data = toSet.data;
            return true;
        }else{
            if(val < curr.data)
                return delete(curr,curr.left,val);
            else{
                return delete(curr,curr.right,val);
            }
        }
    }

}


public class Answer1 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.addNode(0);
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(10);
        tree.addNode(40);
        tree.addNode(70);
        tree.addNode(60);
        tree.addNode(80);
        tree.addNode(55);
        tree.addNode(53);
        tree.addNode(51);
        tree.delete(50);
        tree.delete(70);
        tree.delete(51);
        tree.delete(53);
        tree.delete(55);
        tree.delete(60);
        System.out.println(tree.NonleafNodes());
        tree.print2D();
    }
}
