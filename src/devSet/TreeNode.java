package devSet;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        this.left = null;
        this.right = null;
    }

    public TreeNode(int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public Object getData(){
        return data;
    }
}