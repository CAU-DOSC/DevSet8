package devSet;
import java.util.*;

class IntSetBitVec implements IntSet {
	
	private byte[] bits;
	private int size;
	private int count = -1;
	private int max_val;
	private int max_length;
	
	public IntSetBitVec() {

	}
	
	@Override
	public void intSetImp(int maxelems, int maxval) {
		// construct bit vector capable of holding n bits.
		bits = new byte[(maxval >> 3) + 1]; // 1byte = 8 bits
		max_length = (maxval >> 3) + 1;
		for(int i = 0; i < max_length; i++) {
			bits[i] = 0;
		}
		size = 0;
		max_val = maxval;
	}

	@Override
	public void insert(int element) {
		int abs_element = Math.abs(element);
		if(size >= max_val) {
			throw new ArrayIndexOutOfBoundsException("max_length exceeded.");
		}
		if((bits[abs_element >> 3] & (1<<(abs_element & 7))) != 0) {
			return;
		}
		bits[abs_element>>3] |= 1 << (abs_element& 7);
		size += 1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int[] report() {
		// TODO Auto-generated method stub
		int[] result = new int[size];
		int result_idx = 0;
		for(int i = 0;i<=max_val;i++) {
			if((bits[i >> 3] & (1<<(i & 7))) != 0) {
				result[result_idx] = i;
				result_idx++;
			}
		}
		return result;
	}

}
