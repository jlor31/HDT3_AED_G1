import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortsTest {

	
	
	@Test
	void testGnome() {
		
		Sorts sort = new Sorts();
		int desordenados[] = {6,2,21,8,0,17,3,4,1,2};
		int ordenados[] = {0,1,2,2,3,4,6,8,17,21};
		
		sort.gnomeSort(desordenados, 10);
		
		assert Arrays.equals(desordenados, ordenados);
		
	}
	
	void testquickSort() {
		
		Sorts sort = new Sorts();
		int desordenados[] = {6,2,21,8,0,17,3,4,1,2};
		int ordenados[] = {0,1,2,2,3,4,6,8,17,21};
		
		sort.quickSort(desordenados,0, 9);
		
		assert Arrays.equals(desordenados, ordenados);
		
	}
	
	void testMerge() {
		
		Sorts sort = new Sorts();
		int desordenados[] = {6,2,21,8,0,17,3,4,1,2};
		int ordenados[] = {0,1,2,2,3,4,6,8,17,21};
		
		sort.mergeSort(desordenados, 10);
		
		assert Arrays.equals(desordenados, ordenados);
		
	}

	
	void testRadix() {
		
		Sorts sort = new Sorts();
		int desordenados[] = {6,2,21,8,0,17,3,4,1,2};
		int ordenados[] = {0,1,2,2,3,4,6,8,17,21};
		
		sort.radixSort(desordenados, 10);
		
		assert Arrays.equals(desordenados, ordenados);
		
	}
}
