package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import IntSet.IntSetArr;


class IntSetArrTest {
	IntSetArr a = new IntSetArr();
	private static int MAX_VAL = 1000;
	private static int MAX_ELE = MAX_VAL/100;
	private static Random num = new Random();
	@Test
	void testintSetImp() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		assertEquals(MAX_VAL,a.maxvalue);
		assertEquals(MAX_ELE, a.array.length);
	}

	@Test
	void testSize() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		do {
			a.insert(num.nextInt(MAX_VAL));
		}while(a.size()<MAX_ELE);
		
	}
	
	@Test
	void testInsert() {	
		int[] tmp = {0,1,2,3,4,5,6,7,8,9};

		a.intSetImp(MAX_ELE, MAX_VAL);
		int x=0;
		do {
			a.insert(x++);
		}while(a.size()<MAX_ELE);
		
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(tmp[i], a.array[i]);
		}
	}
	
	@Test
	void testReport() {
		int[] tmp = {0,1,2,3,4,5,6,7,8,9};

		
		a.intSetImp(MAX_ELE, MAX_VAL);
		do {
			a.insert(num.nextInt(MAX_ELE));
		}while(a.size()<MAX_ELE);
		a.report();
		for(int i=0; i<MAX_ELE;i++) {
			assertEquals(tmp[i],a.array[i]);
		}
	}
}
