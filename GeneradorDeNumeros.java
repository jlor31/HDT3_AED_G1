import java.util.Random;

public class GeneradorDeNumeros implements Interfaz{

    @Override
    public int GenerarNum(int num){
        Random random = new Random();

        num = random.nextInt(50 + 1) + 1;

        return num;
    }
    
}
