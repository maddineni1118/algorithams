import java.util.Random;

public class BinaryTree {
    // LinkedList list =  new LinkedList()
    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);
        BinaryTree bt = new BinaryTree();
        Random r = new Random();
        for(int j=1;j<10;j++) {
            bt.insertNode(root,r.nextInt(21));
        }
        bt.printTree(root);
        System.out.println(bt.isNodeExists(root,8));
    }

    public void printTree(TreeNode root) {
        if(root != null) {
            System.out.println(root.data);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public boolean isNodeExists(TreeNode root,int d) {
        if(root == null)
            return false;
         if(root.data == d)
             return true;
         return isNodeExists(root.left,d)||isNodeExists(root.right,d);
    }

    public void insertNode(TreeNode root,int s) {
        if(root == null) {
            root = new TreeNode(s);
        }
        else {
            insertHelp(root,s);
        }
    }

    public void insertHelp(TreeNode root,int s) {
        if(root.data > s) {
        if(root.left == null) {
            root.left = new TreeNode(s);
        }
        else {
            insertHelp(root.left,s);
        }
     }
     else {
          if(root.right == null) {
              root.right = new TreeNode(s);
          }
          else {
            insertHelp(root.right,s);
          }
        }
    }
}

class TreeNode {
     TreeNode left, right;
     int data;
    public TreeNode(int data1) {
        data = data1;
    }
    public int getData() {
        return data;
    }
}
