

//Implementare un test per un metodo che prende in ingresso un intero

public class GameTest {


    void testTiraDado() {

        Game game = new Game();
        int risultato = game.tiraDado();

        if(risultato >= 1 && risultato <= 20) {

            System.out.println("TEST OK: risultato compreso tra 1 e 20");
            System.out.println("risultato: " + risultato);

        }

        else {
            System.out.println("TEST FALLITO: risultato non compreso tra 1 e 20");
        }
    }

    public static void main(String[] args) {

        GameTest test = new GameTest();

        test.testTiraDado();

    }


}

//Adesso se compiliamo, la compilazione fallirà, e questo è normale in TDD,
  //e a questo punto si può implementare la classe Game per poi dopo rieseguire il