package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import IntSet.IntSetArr;


class IntSetArrTest {
	IntSetArr a = new IntSetArr();
	private static int MAX_VAL = 1000;
	private static int MAX_ELE = MAX_VAL/100;
	@Test
	void testintSetImp() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		assertEquals(MAX_VAL,a.maxvalue);
		assertEquals(MAX_ELE, a.array.length);
	}

	@Test
	void testSize() {
		a.size();
		
	}
	
	@Test
	void testInsert() {	
		int[] tmp = new int[MAX_ELE];

		a.intSetImp(MAX_ELE, MAX_VAL);
		int x=0;
		for(int i=0; i<MAX_ELE;i++)
		{
			tmp[i]=x++;
		}
		for(int i=0; i<MAX_ELE;i++)
		{
			a.insert(tmp[i]);
		}
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(tmp[i], a.array[i]);
		}
	}
	
	@Test
	void testReport() {
		int[] tmp = new int[MAX_ELE];

		a.intSetImp(MAX_ELE, MAX_VAL);
		int x=0;
		for(int i=0; i<MAX_ELE;i++)
		{
			tmp[i]=x++;
		}
		for(int i=0; i<MAX_ELE;i++)
		{
			a.insert(tmp[i]);
		}
		a.report();
		for(int i=0; i<MAX_ELE;i++) {
			assertEquals(tmp[i],a.array[i]);
		}
	}
}
