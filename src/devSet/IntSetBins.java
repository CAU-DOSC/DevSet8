
public class IntSetBins implements IntSet{
	private int[] array;
	private int size;
	private int maxvalue;
	
	public IntSetBins() {
		this.size=0;
		this.maxvalue=0;
		
	}
	public int size() {
		return this.size;
		
	}
	public void intSetImp(int maxelems, int maxval) {
		this.array = new int[maxelems];
		this.maxvalue = maxval;
		
	}
	
	public void insert(int element) { //insert
		if(this.size < this.array.length && element < this.maxvalue) {
			for(int i=0;i<this.size;i++) {
				if(element == this.array[i]) {
					return ;
				}
			}
			this.array[size] = element;
			this.size++;
		}
	}
	public int[] report() {
		sort();
		return this.array;
	}
	private void sort() {
	      int [] bucket=new int[this.maxvalue+1];
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	      }
	 
	      for (int i=0; i<this.array.length; i++) {
	         bucket[this.array[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	        	 this.array[outPos++]=i;
	         }
	      }
	   }
	
}
