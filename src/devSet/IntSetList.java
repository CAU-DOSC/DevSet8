package Set;

import java.util.Comparator;
import java.util.LinkedList;

public class IntSetList implements IntSet{
	
	public int maxvalue;
	public int maxelems;
	public LinkedList<Integer> List = new LinkedList<Integer>();

	public IntSetList() {
		maxvalue=0;
		maxelems=0;
	}

	
	public void intSetImp(int maxelems, int maxval) {
			this.maxelems = maxelems;
			this.maxvalue = maxval;
	}
	
	public void insert(int elem) { //insert
		if(!List.contains(elem)&& List.size() < maxelems && elem < maxvalue) {
			List.add(elem);;
		}
	}
	
	public int[] report() { 
		int tmp[] =new int[List.size()]; 
		List.sort(new Comparator<Integer>() {
			public int compare(Integer obj1, Integer obj2){
				return obj1.compareTo(obj2); // using compareTo
			}
		});
		
		for(int index = 0; index <tmp.length; index ++) {
			tmp[index] = List.get(index); //copy ordered List to int arr tmp 
		}
		return tmp;
	}
	public int size() {
		return List.size();
		
	}
}
