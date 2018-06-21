package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import IntSet.IntSetList;


class IntSetListTest {

	IntSetList a = new IntSetList();
	private static int MAX_VAL = 1000000;
	private static int MAX_ELE = MAX_VAL/100;
	private static Random num = new Random();
	
	
	@Test
	void testIntSetImp() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		assertEquals(MAX_VAL,a.maxvalue);
		assertEquals(MAX_ELE, a.maxelems);
	}
	
	
	@Test
	void testInsert() {

		a.intSetImp(MAX_ELE, MAX_VAL);

		int x =0;
		for(int i=0;i<MAX_ELE;i++)
		{
			a.insert(x++);
		}
		assertEquals(a.size(), MAX_ELE);
	}
	
	@Test
	void testReport() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		for(int i=0;i<MAX_ELE;i++)
		{
			
			a.insert(num.nextInt(MAX_ELE));
		}
		a.report();
		
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(a.size(), a.List.size());
		}
	}


	@Test
	void testSize() {
		a.size();
	}

}
