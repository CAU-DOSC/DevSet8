package devSet;

public class IntSetArr implements IntSet{
	public int[] array;
	public int size;
	public int maxvalue;
	
	public IntSetArr() {
		size=0;
		maxvalue=0;
		
	}
	public int size() {
		return size;
		
	}
	public void intSetImp(int maxelems, int maxval) {
		array = new int[maxelems];
		maxvalue = maxval;
		
	}
	
	public void insert(int element) { //insert
		if(size < array.length && element < maxvalue) {
			for(int i=0;i<size;i++) {
				if(element == array[i]) {
					return ;
				}
			}
			array[size] = element;
			size++;
		}
	}
	public int[] report() {
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

