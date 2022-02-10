/* HDT3 GRUPO1 
 * JUAN LORTHIOIS
 * CINDY GUALIM
 * CARLOS ESTRADA
 */



import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.util.Random;

public class Main {
	
	
	static GeneradorDeNumeros GenNum = new GeneradorDeNumeros();
	
	static int numeros[] = {};
	
	
	
	public static void lectorNums() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("enteros.txt"));
			
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
		
		
	}
	
	
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
    pruebaGnome();
    pruebaquickSort();
    pruebamergeSort();
    pruebaradixSort();
        

    }
}
