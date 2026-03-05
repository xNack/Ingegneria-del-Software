
import java.util.Random;

public class Game {

    private final int facceDado = 20;
    private final Random rand = new Random();

    public int tiraDado() { return rand.nextInt(facceDado) + 1; }


    public static void main(String[] args) {

    }
    
}
