/* HDT3 GRUPO1 
 * Implementación de la interfaz
 * JUAN LORTHIOIS
 * CINDY GUALIM
 * CARLOS ESTRADA
 */

import java.util.Arrays;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class GeneradorDeNumeros implements Interfaz{

	
	int ArrayEnteros[] = {};
	
	
	
    @Override
    public int GenerarNum(){
        Random random = new Random();

        int num = random.nextInt(3001);

        return num;
    }

	@Override
	public void GenerarLista() {
		
		for (int i = 0; i < 3000; i++) {
			
			int n = GenerarNum();
			
			ArrayEnteros = Arrays.copyOf(ArrayEnteros, ArrayEnteros.length+1);
			ArrayEnteros[ArrayEnteros.length - 1] = n;
			
		}
		
		GuardarNumeros();
	}
    
	public void GuardarNumeros() {
		
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Dev\\HDT3_AED_G1\\HDT3_AED_G1\\enteros.txt"));
			
			for (int n : ArrayEnteros) {
				
				escritor.write(  n+ "\n" );
				
					
				}
				
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
    
    
}
