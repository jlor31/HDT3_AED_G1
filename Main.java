import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.util.Random;

public class Main {
    public static void main(String[] args){


        int i = 0;

        //Inicializar el stack
        StackArray<Integer> miStack = new StackArray<Integer>();

        //Inicializar la interfaz
        GeneradorDeNumeros Generador = new GeneradorDeNumeros();

        //Crear el archivo
        //FileReader archivo = new FileReader("numeros.txt");

        Random random = new Random();

        while (i <= 3000){
            int num = random.nextInt(9 + 0) + 0;

            
            try {
                FileWriter fw = new FileWriter("numeros.txt", true);
                
                fw.write(num);
                fw.close();
            } catch (Exception e) {
                System.out.println("Error al escribir");
            }

            i++;
            

        }
        

    }
}
