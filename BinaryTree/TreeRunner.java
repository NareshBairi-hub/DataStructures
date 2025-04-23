package BinaryTree;

public class TreeRunner {
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.println("----------Printing INORDER-------");
        tree.inorder();

        System.out.println("----------Printing PREORDER-------");
        tree.preorder();

        System.out.println("----------Printing POSTORDER-------");
        tree.postorder();

    }
    
}
