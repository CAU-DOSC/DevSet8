package devSet;

public class IntSetBST implements IntSet{

	BinarySearchTree bst;
	private int maxval;
	private int maxelems;
	
	@Override
	public void intSetImp(int maxelems, int maxval) {
		// TODO Auto-generated method stub
		bst = new BinarySearchTree();
		this.maxval = maxval;
		this.maxelems = maxelems;
	}

	@Override
	public void insert(int element) {
		// TODO Auto-generated method stub
		if(bst.getSize() > maxelems) {
			return ;
		}
		else if(element > maxval) {
			return ;
		}
		bst.insertBST(element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return bst.getSize();
	}

	@Override
	public int[] report() {
		// TODO Auto-generated method stub
		return bst.inorder();
	}

}
