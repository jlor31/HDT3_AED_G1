/* HDT3 GRUPO1 
	 * JUAN LORTHIOIS
	 * CINDY GUALIM
	 * CARLOS ESTRADA
	 */



	import java.io.BufferedReader;
	
	import java.io.IOException;
	import java.io.FileReader;
	
	import java.util.Arrays;
	

	public class Main {
		
		
		static GeneradorDeNumeros GenNum = new GeneradorDeNumeros();
		
		static int numeros[] = {};
		
		static int ordenados[] = {};
		
		public static void generarOrdenados() {
			
			for (int i = 1; i <3001; i++) {
				
				ordenados = Arrays.copyOf(ordenados, ordenados.length+1);
				ordenados[ordenados.length - 1] = i;
				
			}
			
		}
		
		public static void lectorNums() {
			
			try {
				
				BufferedReader reader = new BufferedReader(new FileReader("C:\\Dev\\HDT3_AED_G1\\HDT3_AED_G1\\enteros.txt"));
				
				String linea;
				
				
				while((linea = reader.readLine()) != null) {
					
					int n = Integer.parseInt(linea);
					
					numeros = Arrays.copyOf(numeros, numeros.length+1);
					numeros[numeros.length - 1] = n;
				    
				}
				
				reader.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
		}
			
		}
		
		
		
		public static void setUp() {
			
			GenNum.GenerarLista();
			lectorNums();
			generarOrdenados();
			
		}
		
		///////////////METODOS PARA PROBAR GNOME SORT CON DATOS DESORDENADOS
		
		public static void gnomeSort600() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <600; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
			}
			
			Sorts.gnomeSort(Data, 600);
			
		}
		
		public static void gnomeSort1200() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1200; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
			
			}
			
			Sorts.gnomeSort(Data, 1200);
		}
		
		
		public static void gnomeSort1800() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1800; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 1800);
		}
		
		
		public static void gnomeSort2400() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <2400; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 2400);
		}
		
		
		public static void gnomeSort3000() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <3000; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = numeros[i];
			
		}
		Sorts.gnomeSort(Data, 3000);
		}
		
		
		//////////////// METODOS PARA PROBAR GNOME SORT CON DATOS ORDENADOS
		
		
	public static void gnomeSortOrdenados600() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <600; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 600);
		}
		
		public static void gnomeSortOrdenados1200() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1200; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 1200);
		}
		
		
		public static void gnomeSortOrdenados1800() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1800; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 1800);
		}
		
		
		public static void gnomeSortOrdenados2400() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <2400; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.gnomeSort(Data, 2400);
			}
		
		
		public static void gnomeSortOrdenados3000() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <3000; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.gnomeSort(Data, 3000);
		}
		
		
		///////////// METODOS PARA PROBAR QUICK SORT CON DATOS DESORDENADOS
		
		
		public static void quickSort600() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <600; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 599);
		}
		
		public static  void quickSort1200() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1200; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 1199);
		}
		
		
		public static  void quickSort1800() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1800; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 1799);
		}
		
		
		public static  void quickSort2400() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <2400; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 2399);
			}
		
		
		public  static  void quickSort3000() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <3000; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = numeros[i];
			
			
			
		}
		Sorts.quickSort(Data,0, 2999);
		}
		
		
		////// METODOS PARA PROBAR QUICK SORT SOBRE DATOS ORDENADOS
		
		
	public static   void quickSortOrdenados600() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <600; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 599);
		}
		
		public static   void quickSortOrdenados1200() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1200; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 1199);
		}
		
		
		public static   void quickSortOrdenados1800() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1800; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 1799);
		}
		
		
		public static   void quickSortOrdenados2400() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <2400; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = ordenados[i];
				
				
				
			}
			Sorts.quickSort(Data,0, 2399);
			}
		
		
		public static   void quickSortOrdenados3000() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <3000; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.quickSort(Data,0, 2999);
		}
		
		
		///////// METODOS PARA PROBAR MERGE SORT SOBRE DATOS DESORDENADOS
		
		
	public static void   mergeSort600() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <600; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.mergeSort(Data, 600);
		}
		
		public  static  void mergeSort1200() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1200; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.mergeSort(Data, 1200);
		}
		
		
		public  static  void mergeSort1800() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <1800; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.mergeSort(Data, 1800);
		}
		
		
		public  static  void mergeSort2400() {
			
			
			int Data[] = {};
			
			for (int i = 0; i <2400; i++) {
				
				Data = Arrays.copyOf(Data, Data.length+1);
				Data[Data.length - 1] = numeros[i];
				
				
				
			}
			Sorts.mergeSort(Data, 2400);
			}
		
		
		public  static  void mergeSort3000() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <3000; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = numeros[i];
			
			
			
		}
		Sorts.mergeSort(Data, 3000);
		}
		
	///////// METODOS PARA PROBAR MERGE SORT SOBRE DATOS SORDENADOS
		
		
	public static   void mergeSortOrdenados600() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <600; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.mergeSort(Data, 600);
	}

	public  static  void mergeSortOrdenados1200() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <1200; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.mergeSort(Data, 1200);
	}


	public  static  void mergeSortOrdenados1800() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <1800; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.mergeSort(Data, 1800);
	}


	public  static  void mergeSortOrdenados2400() {
		
		
		int Data[] = {};
		
		for (int i = 0; i <2400; i++) {
			
			Data = Arrays.copyOf(Data, Data.length+1);
			Data[Data.length - 1] = ordenados[i];
			
			
			
		}
		Sorts.mergeSort(Data, 2400);
		}


	public  static  void mergeSortOrdenados3000() {


	int Data[] = {};

	for (int i = 0; i <3000; i++) {
		
		Data = Arrays.copyOf(Data, Data.length+1);
		Data[Data.length - 1] = ordenados[i];
		
		
		
	}
	Sorts.mergeSort(Data, 3000);
	}
		
		
	///////// METODOS PARA PROBAR RADIX SORT SOBRE DATOS DESORDENADOS


	public  static  void radixSort600() {


	int Data[] = {};

	for (int i = 0; i <600; i++) {
		
		Data = Arrays.copyOf(Data, Data.length+1);
		Data[Data.length - 1] = numeros[i];
		
		
		
	}
	Sorts.radixSort(Data, 600);
	}

	public  static  void radixSort1200() {


	int Data[] = {};

	for (int i = 0; i <1200; i++) {
		
		Data = Arrays.copyOf(Data, Data.length+1);
		Data[Data.length - 1] = numeros[i];
		
		
		
	}
	Sorts.radixSort(Data, 1200);
	}


	public  static  void radixSort1800() {


	int Data[] = {};

	for (int i = 0; i <1800; i++) {
		
		Data = Arrays.copyOf(Data, Data.length+1);
		Data[Data.length - 1] = numeros[i];
		
		
		
	}
	Sorts.radixSort(Data, 1800);
	}


	public static   void radixSort2400() {


	int Data[] = {};

	for (int i = 0; i <2400; i++) {
		
		Data = Arrays.copyOf(Data, Data.length+1);
		Data[Data.length - 1] = numeros[i];
		
		
		
	}
	Sorts.radixSort(Data, 2400);
	}


	public  static  void radixSort3000() {


	int Data[] = {};

	for (int i = 0; i <3000; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = numeros[i];



	}
	Sorts.radixSort(Data, 3000);
	}
		
		
	///////// METODOS PARA PROBAR RADIX SORT SOBRE DATOS DESORDENADOS


	public static void radixSortOrdenados600() {


	int Data[] = {};

	for (int i = 0; i <600; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = ordenados[i];



	}
	Sorts.radixSort(Data, 600);
	}

	public static void radixSortOrdenados1200() {


	int Data[] = {};

	for (int i = 0; i <1200; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = ordenados[i];



	}
	Sorts.radixSort(Data, 1200);
	}


	public static void radixSortOrdenados1800() {


	int Data[] = {};

	for (int i = 0; i <1800; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = ordenados[i];



	}
	Sorts.radixSort(Data, 1800);
	}


	public static void radixSortOrdenados2400() {


	int Data[] = {};

	for (int i = 0; i <2400; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = ordenados[i];



	}
	Sorts.radixSort(Data, 2400);
	}


	public static void radixSortOrdenados3000() {


	int Data[] = {};

	for (int i = 0; i <3000; i++) {

	Data = Arrays.copyOf(Data, Data.length+1);
	Data[Data.length - 1] = ordenados[i];



	}
	Sorts.radixSort(Data, 3000);
	}




		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		 public static void pruebaGnome() {
			 System.out.println("-------------------PRUEBA GNOME SORT ----------------------");
			 int range[] = {1,2,3,4,5,6,7,8,9,10};
			 
			 for (int i : range ) {
				 
				 int Data[] = {};
				 
				 for (int j = 0; j < i*300; j++) {  // Creando un array temporal con i*300 numeros enteros aleatorios
					 
					Data = Arrays.copyOf(Data, Data.length+1);
					Data[Data.length - 1] = numeros[j];
					 
				 }
				 
				 long start = System.nanoTime();
				 Sorts.gnomeSort(Data, i*300);
				 long stop = System.nanoTime();
				 System.out.println("Tiempo array desordenado con: " + (i*300) + " enteros: " + (stop - start));
				 
				 long start1 = System.nanoTime();
				 Sorts.gnomeSort(Data, i*300);
				 long stop1 = System.nanoTime();
				 System.out.println("Tiempo array ordenado con: " + (i*300) + " enteros: " + (stop1 - start1));
				 
			 }
			 
			 System.out.println("------------------- FIN PRUEBA GNOME SORT ----------------------");
			 System.out.println(" ");
			 
		 }
		
		 public static void pruebaquickSort() {
			 System.out.println("-------------------PRUEBA QUICK SORT ----------------------");
			 int range[] = {1,2,3,4,5,6,7,8,9,10};
			 
			 for (int i : range ) {
				 
				 int Data[] = {};
				 
				 for (int j = 0; j < i*300; j++) {  // Creando un array temporal con i*300 numeros enteros aleatorios
					 
					Data = Arrays.copyOf(Data, Data.length+1);
					Data[Data.length - 1] = numeros[j];
					 
				 }
				 
				 long start = System.nanoTime();
				 Sorts.mergeSort(Data, i*300);
				 long stop = System.nanoTime();
				 System.out.println("Tiempo array desordenado con: " + (i*300) + " enteros: " + (stop - start));
				 
				 long start1 = System.nanoTime();
				 Sorts.mergeSort(Data, i*300);
				 long stop1 = System.nanoTime();
				 System.out.println("Tiempo array ordenado con: " + (i*300) + " enteros: " + (stop1 - start1));
				 
			 }
			 
			 System.out.println("------------------- FIN PRUEBA QUICK SORT ----------------------");
			 System.out.println(" ");
			 
		 }
		 
		 public static void pruebamergeSort() {
			 System.out.println("-------------------PRUEBA MERGE SORT ----------------------");
			 int range[] = {1,2,3,4,5,6,7,8,9,10};
			 
			 for (int i : range ) {
				 
				 int Data[] = {};
				 
				 for (int j = 0; j < i*300; j++) {  // Creando un array temporal con i*300 numeros enteros aleatorios
					 
					Data = Arrays.copyOf(Data, Data.length+1);
					Data[Data.length - 1] = numeros[j];
					 
				 }
				 
				 long start = System.nanoTime();
				 Sorts.mergeSort(Data, i*300);
				 long stop = System.nanoTime();
				 System.out.println("Tiempo array desordenado con: " + (i*300) + " enteros: " + (stop - start));
				 
				 long start1 = System.nanoTime();
				 Sorts.mergeSort(Data,i*300);
				 long stop1 = System.nanoTime();
				 System.out.println("Tiempo array ordenado con: " + (i*300) + " enteros: " + (stop1 - start1));
				 
			 }
			 
			 System.out.println("------------------- FIN PRUEBA MERGE SORT ----------------------");
			 System.out.println(" ");
			 
		 }
		
		 public static void pruebaradixSort() {
			 System.out.println("-------------------PRUEBA RADIX SORT ----------------------");
			 int range[] = {1,2,3,4,5,6,7,8,9,10};
			 
			 for (int i : range ) {
				 
				 int Data[] = {};
				 
				 for (int j = 0; j < i*300; j++) {  // Creando un array temporal con i*300 numeros enteros aleatorios
					 
					Data = Arrays.copyOf(Data, Data.length+1);
					Data[Data.length - 1] = numeros[j];
					 
				 }
				 
				 long start = System.nanoTime();
				 Sorts.radixSort(Data, i*300);
				 long stop = System.nanoTime();
				 System.out.println("Tiempo array desordenado con: " + (i*300) + " enteros: " + (stop - start));
				 
				 long start1 = System.nanoTime();
				 Sorts.radixSort(Data,i*300);
				 long stop1 = System.nanoTime();
				 System.out.println("Tiempo array ordenado con: " + (i*300) + " enteros: " + (stop1 - start1));
				 
			 }
			 
			 System.out.println("------------------- FIN PRUEBA RADIX SORT ----------------------");
			 System.out.println(" ");
			 
		 }
		 
		 
		
	    public static void main(String[] args){
	    	
	    
	    setUp();
	    
	    gnomeSort600();
	    gnomeSort1200();
	    gnomeSort1800();
	    gnomeSort2400();
	    gnomeSort3000();
	    
	    gnomeSortOrdenados600();
	    gnomeSortOrdenados1200();
	    gnomeSortOrdenados1800();
	    gnomeSortOrdenados2400();
	    gnomeSortOrdenados3000();
	    
	    quickSort600();
	    quickSort1200();
	    quickSort1800();
	    quickSort2400();
	    quickSort3000();
	    
	    quickSortOrdenados600();
	    quickSortOrdenados1200();
	    quickSortOrdenados1800();
	    quickSortOrdenados2400();
	    quickSortOrdenados3000();
	    
	    mergeSort600();
	    mergeSort1200();
	    mergeSort1800();
	    mergeSort2400();
	    mergeSort3000();
	    
	    mergeSortOrdenados600();
	    mergeSortOrdenados1200();
	    mergeSortOrdenados1800();
	    mergeSortOrdenados2400();
	    mergeSortOrdenados3000();
	    
	    radixSort600();
	    radixSort1200();
	    radixSort1800();
	    radixSort2400();
	    radixSort3000();
	    
	    radixSortOrdenados600();
	    radixSortOrdenados1200();
	    radixSortOrdenados1800();
	    radixSortOrdenados2400();
	    radixSortOrdenados3000();
	    
	   
	    }
	}

	