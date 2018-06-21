package devSet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class IntSetBSTTest {

	IntSetBST bst = new IntSetBST();
	private static int MAX_VAL = 1000000;
	private static int MAX_ELE = MAX_VAL/100;
	private static Random num = new Random();

	@Test
	void testIntSetImp() {
		bst.intSetImp(MAX_ELE, MAX_VAL);
		assertEquals(MAX_VAL, bst.maxval);
		assertEquals(MAX_ELE, bst.maxelems);
	}
	
	@Test
	void testInsert() {

		bst.intSetImp(MAX_ELE, MAX_VAL);

		int x =0;
		for(int i=0;i<MAX_ELE;i++)
		{
			bst.insert(x++);
		}
		System.out.println("bst size: " + bst.size());
		assertEquals(bst.size(), MAX_ELE);
	}
	
	@Test
	void testReport() {
		bst.intSetImp(MAX_ELE, MAX_VAL);
		for(int i=0;i<MAX_ELE;i++)
		{
			bst.insert(num.nextInt(MAX_ELE));
		}
		bst.report();
		
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(bst.size(), bst.bst.getSize());
		}
	}


	@Test
	void testSize() {
		bst.size();
	}
}
