package Trees;

import classes.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueues {

    TreeNode root;

    public void printLevelOrderUsingQueues() {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        //System.out.println(queue);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.key);

            if(temp.left!=null) {
                queue.add(temp.left);
               // temp = queue.poll();
                //System.out.println(temp.key);
            }
            if(temp.right!=null) {
                queue.add(temp.right);
               // temp = queue.poll();
                //System.out.println(temp.key);
            }
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversalUsingQueues level = new LevelOrderTraversalUsingQueues();

        level.root = new TreeNode(1);
        level.root.left = new TreeNode(2);
        level.root.right = new TreeNode(3);
        level.root.right.right = new TreeNode(5);
        level.root.left.left = new TreeNode(4);

        level.printLevelOrderUsingQueues();
    }
}
