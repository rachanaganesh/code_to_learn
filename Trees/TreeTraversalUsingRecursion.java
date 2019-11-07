package Trees;

import classes.TreeNode;

public class TreeTraversalUsingRecursion {
    TreeNode root;

     void Inorder(TreeNode node) {
        if(node == null) return;

         Inorder(node.left);
         System.out.println(node.key +" ");
         Inorder(node.right);
    }

    void preorder(TreeNode node) {
        if(node == null) return;

        System.out.println(node.key +" ");
        preorder(node.left);
        preorder(node.right);
    }



     void PostOrder(TreeNode node) {
         if(node == null) return;

         PostOrder(node.left);
         PostOrder(node.right);
         System.out.println(node.key +" ");

     }

//     void Inorder() { Inorder(root);}
//    void preorder() { preorder(root);}
//    void PostOrder() { PostOrder(root);}

    public static void main(String[] args) {
        TreeTraversalUsingRecursion tree = new TreeTraversalUsingRecursion();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(4);

        System.out.println("Inorder:");
        tree.Inorder(tree.root);
        System.out.println("pre-order:");
        tree.preorder(tree.root);
        System.out.println("Post-order:");
        tree.PostOrder(tree.root);

    }

}
