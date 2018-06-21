package Set;

public class IntSetArr implements IntSet {
	private int[] array;
	private int length;
	private int maxval;
	
	public IntSetArr() {
		length = 0;
		maxval = 0;
	}

	@Override
	public void intSetImp(int maxelems, int maxval) {
		// TODO Auto-generated method stub
		array = new int[maxelems];
		this.maxval = maxval;
	}

	@Override
	public void insert(int element) {
		// TODO Auto-generated method stub
		if(length < array.length && element <= maxval) {
			for(int i = 0; i < length; i++) {
				if(array[i] == element)
					return;
			}
			array[length] = element;
			length ++;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public int[] report() {
		// TODO Auto-generated method stub
		sort();
		
		return array;
	}
	
	private void sort() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
}
