package BinaryTree;

public class BinaryTree {
    Node root;

    public void insert(int data){
        root=insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        if(root==null)
            root=new Node(data);
        else if(data<root.data)
            root.left=insertRec(root.left, data);
        else if(data>root.data)
            root.right=insertRec(root.right, data);

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);
    }

    public void preorderRec(Node root){
        if(root!=null){
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.println(root.data);
        }
    }
    
    public void postorder(){
        postorderRec(root);
    }

    public void postorderRec(Node root){
        if(root!=null){
            System.out.println(root.data);
            postorderRec(root.left);
            postorderRec(root.right);
        }
    }
}