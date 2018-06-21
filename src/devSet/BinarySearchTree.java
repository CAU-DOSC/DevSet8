package devSet;

import java.util.ArrayList;

public class BinarySearchTree {
    private TreeNode root = new TreeNode();
    private int size = 0;
    
    public TreeNode insertKey(TreeNode root, int x) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode(x);
        this.size++;
        
        if(p==null){
        	this.size--;
            return newNode;
        }
        else if(p.data>newNode.data){
            p.left = insertKey(p.left, x);
            return p;
        }
        else if(p.data<newNode.data){
            p.right = insertKey(p.right, x);
            return p;
        }
        else{ 
            return p;
        }
    }
    
    public int getSize() {
    	return this.size;
    }
    
    public void insertBST(int x){
        root = insertKey(root, x);
    }
    
    public TreeNode searchBST(int x){
        TreeNode p = root;
        while(p!=null){
            if(x<p.data) p = p.left;
            else if(x>p.data) p = p.right;
            else return p;
        }
        return p;
    }
    
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(this.root!=null){
            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);
        }
    }

    public int[] inorder() {
    	int[] result = new int[this.size];
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	this.inorder(this.root, list);
    	
    	for(int i=0; i<list.size(); i++) {
    		result[i] = list.get(i);
    	}
    	return result;
    }
}