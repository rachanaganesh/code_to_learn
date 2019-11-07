package Trees;

import classes.TreeNode;
import sun.reflect.generics.tree.Tree;

public class LC_100_SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q == null)
        {
            return true;
        }
        if(p==null || q == null){
            return false;
        }
        if(p.key!=q.key){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
    public static void main(String[] args) {
        TreeNode p =new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(LC_100_SameTree.isSameTree(p, q));
    }
}
