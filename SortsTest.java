import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortsTest {

	@Test
	void testGnomeSort() {
		int[] arr = new int [0];
		int obteniendo = Sorts.gnomeSort([0], 15);
		equals(0<15);
		
	}
  
	@Test
	void testMergeSort() {
		int[] arr = new int [0];
		
		int obteniendo = Sorts.mergeSort([0],15);
	}

	@Test
	void testSwap() {
		int[] arr = new int [0];
		
		int obteniendo = Sorts.swap([0], 0,15); 
	}

	@Test
	void testPartition() {
		int obteniendo = Sorts.partition([0], 0,15);   
	}

	@Test
	void testQuickSort() {
		int obteniendo =Sorts.quickSort([0], 0,15);
	}

	@Test
	void testGetMax() {
		int obteniendo =Sorts.getMax([0], 0,15); 
	}

	@Test
	void testCountSort() {
		int obteniendo = Sorts.countSort([0],0,15);
	}

	@Test
	void testRadixSort() {
		int obteniendo = Sorts.radixSort([0],0,15);
	}

}
