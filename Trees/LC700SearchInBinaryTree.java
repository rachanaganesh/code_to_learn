package Trees;

import classes.TreeNode;

public class LC700SearchInBinaryTree {
    TreeNode root;

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = root;
        if(root==null) return null;
        if(root.key==val) return root;

        return val < root.key? searchBST(root.left,val):searchBST(root.right,val);

    }






    public static void main(String[]args) {
        LC700SearchInBinaryTree binTree = new LC700SearchInBinaryTree();

        binTree.root = new TreeNode(4);
        binTree.root.left = new TreeNode(2);
        binTree.root.right = new TreeNode(7);
        binTree.root.left.right = new TreeNode(3);
        binTree.root.left.left = new TreeNode(1);

        System.out.println(binTree.searchBST(binTree.root,1).key);

    }
}
