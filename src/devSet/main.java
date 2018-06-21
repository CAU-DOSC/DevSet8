package Set;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v;
		
		final int m = 50;
		final int maxval = 100;
		
		Random rand = new Random();
		
		IntSet S = new IntSetBins();
	    
		S.intSetImp(m, maxval);

		while (S.size() < m)
			S.insert(rand.nextInt(maxval));
		
		v = S.report();
	    
	    for (int i = 0; i < v.length; i++)
	    	System.out.println(v[i] + " / line : " + i);
	}
}
