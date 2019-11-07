package Trees;

import classes.ListNode;
import classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class CTCI_43_ListofDepths {

    public static LinkedList<TreeNode> listofDepths(TreeNode node, int level){
        if(node==null) return null;
        LinkedList<TreeNode> lists =null;

        if(level == 0){
            lists.add(node);
        }
        if(level>1){
            listofDepths(node.left,level+1);
            listofDepths(node.right,level+1);
        }
        return lists;

    }
    public static void main(String[] args){
        ArrayList<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        System.out.println(CTCI_43_ListofDepths.listofDepths(node,0));

    }
}
