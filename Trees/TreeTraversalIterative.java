package Trees;

import classes.TreeNode;

import java.util.Stack;

public class TreeTraversalIterative {
    //Max no of nodes at level 'I' of binary tree is 2*pow(I-1);
    TreeNode root;


    public void Inorder() {
        Stack<TreeNode> S = new Stack<TreeNode>();

        TreeNode current = root;
      if(root==null) return ;

      while(current != null || S.size()>0) {
          while(current!=null) {
              S.push(current);
              current = current.left;
          }

         current= S.pop();
          System.out.println(current.key);
          current = current.right;
      }
            //if current is null

    }

    public void preorder() {
        Stack<TreeNode> P = new Stack<TreeNode>();

        TreeNode pre = root;
        if(root==null)  return;
        P.push(pre);
        while (P.empty()==false) {
            TreeNode mynode = P.peek();
            System.out.println(mynode.key);
            P.pop();

            if(pre.right!=null) {
                P.push(pre.right);
            }

            if(pre.left!=null) {
                P.push(pre.left);
            }

        }

//    public void InorderWithoutStack() {
//        TreeNode currentNoStack = root , pre;
//        if(root==null) return ;
//
//        while(currentNoStack != null) {
//            if (currentNoStack.left == null) {
//                System.out.println(currentNoStack.key);
//                currentNoStack = currentNoStack.left;
//            } else {
//                pre = currentNoStack.left;
//                while (pre.right != null) pre = pre.right;
//                if (pre.right == null) {
//                    pre.right = currentNoStack;
//                    currentNoStack = currentNoStack.left;
//                }
//
//            }
//        }

    }


    public static void main(String[] args) {
        TreeTraversalIterative tree = new TreeTraversalIterative();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);
        tree.root.left.right = new TreeNode(3);

        //tree.Inorder();
        tree.preorder();
       // tree.InorderWithoutStack();
    }
}
