package Trees;

import classes.TreeNode;
import sun.reflect.generics.tree.Tree;

public class LevelOrderTraversal {

    TreeNode root;

    public void printLevelOrder() {
        int height = height(root);
        for(int i=1; i<=height; i++) {
            printNode(root, i);
        }
    }

    public void printNode(TreeNode root, int level) {
        if(root==null) return ;

        if(level==1) {
            System.out.println(root.key);
        }
        else if (level >1){
            printNode(root.left,level-1);
            printNode(root.right,level-1);
        }
    }
    public int height(TreeNode root) {
        if(root==null) return 0;
        else {
            int lLength = height(root.left);
            int rLength = height(root.right);

            return Math.max(lLength,rLength)+1;

        }

    }

    public static void main(String[]args) {
        LevelOrderTraversal level = new LevelOrderTraversal();

        level.root = new TreeNode(1);
        level.root.left = new TreeNode(2);
        level.root.right = new TreeNode(3);
        level.root.right.right = new TreeNode(5);
        level.root.left.left = new TreeNode(4);

        level.printLevelOrder();
    }

}
