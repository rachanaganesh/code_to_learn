package Trees;

import classes.TreeNode;

public class LC_606_ConstructStringFromBinaryTree {
    TreeNode root;

    public String stringTree() {
        if(root == null) return "";
      if(root.left!=null && root.right!=null) {
          return root.key + "";
      }


        return root.key + "("  ;
    }

    public static void main(String[]args) {
        LC_606_ConstructStringFromBinaryTree str = new LC_606_ConstructStringFromBinaryTree();

        str.root = new TreeNode(1);
        str.root.left = new TreeNode(2);
        str.root.right = new TreeNode(3);
        str.root.right.right = new TreeNode(5);
        str.root.left.left = new TreeNode(4);

        str.stringTree();
    }
}
