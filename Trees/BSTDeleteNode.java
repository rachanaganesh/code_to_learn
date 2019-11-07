package Trees;
import classes.TreeNode;
public class BSTDeleteNode {
    TreeNode root;

    public TreeNode deleteNode(TreeNode root, int data){
        if(root==null) return root;
        if(data < root.key) {
            deleteNode(root.left,data);
        }
        else if(data > root.key){
            deleteNode(root.right,data);
        }
        else{
            if(root.right!=null && root.left!=null){
                TreeNode temp = root;
                TreeNode minVal = minimumElement(temp.right);
                root.key = minVal.key;
                deleteNode(root.right,minVal.key);
        } else if(root.left!=null) {
            root = root.left;
        } else if(root.right!=null) {
            root = root.right;
        } else
            root = null;
        }
        return root;
    }

    public TreeNode minimumElement(TreeNode root) {
        if(root.left==null)return root;
        else{
            return minimumElement(root.left);
        }
    }
    public static void main(String[] args) {
        int key=2;
        BSTDeleteNode delete = new BSTDeleteNode();
        delete.root = new TreeNode(5);
        delete.root.left = new TreeNode(3);
        delete.root.right = new TreeNode(6);
        delete.root.left.left = new TreeNode(2);
        delete.root.left.right = new TreeNode(4);
        delete.root.right.right = new TreeNode(7);

        System.out.println(delete.deleteNode(delete.root,key).key);
    }
}
