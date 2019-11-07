package Trees;

import classes.TreeNode;
import sun.reflect.generics.tree.Tree;

public class MergeBinaryTrees {
    TreeNode root1;
    TreeNode root2;

    public TreeNode mergeTwoBinaryTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        t1.key = t1.key + t2.key;
      //  System.out.println(root1.key);
        t1.left = mergeTwoBinaryTrees(t1.left,t2.left);
        t1.right = mergeTwoBinaryTrees(t1.right, t2.right);
        System.out.println(t1.key);
        return t1;

    }

    public static void main(String[] args) {
        MergeBinaryTrees merge = new MergeBinaryTrees();
        merge.root1 =  new TreeNode(1);
        merge.root1.left =  new TreeNode(3);
        merge.root1.right =  new TreeNode(2);
        merge.root1.left.left =  new TreeNode(5);


        merge.root2 =  new TreeNode(2);
        merge.root2.left =  new TreeNode(1);
        merge.root2.right =  new TreeNode(3);
        merge.root2.left.right =  new TreeNode(4);
        merge.root2.right.right =  new TreeNode(7);

        System.out.println(merge.mergeTwoBinaryTrees(merge.root1,merge.root2));

    }

}
