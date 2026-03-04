import java.time.LocalDate;

/*
    Una classe in Java è memorizzata su un singolo file
 */

/**
 * Classe che stampa a schermo un msg
 */

//Attenzione a mettere il nome del file uguale al nome della classe!

public class HelloWorld { //Non ci devono essere spazi nel nome della classe, ed è buona pratica mettere la prima lettera di una classe maiuscola come convenzione.
                          //Se ci sono due parole, ogni parola inizia con maiuscola, questo viene detto Camel Case, così la distinguiamo più facilmente da altre cose che non sono classi.

 //public indica la visibilità, sarà visibile da tutte le altre parti del codice.
 //private non sarà visibile a tutte la parti del codice ma visibile solo in certi contesti.
 
 //una classe è composta da attributi e metodi, anche gli attributi avranno una certa visibilità,
 //e in Java è consigliabile che tutti gli attributi siano privati. Questo significa che il codice,
 //di questa classe potra usare questi attributi ma non le altre classi al di fuori, questo si chiama information hiding, fondamentale nei sistemi ad oggetti per nascondere certe informazioni a chi è all'esterno.
 //l'interazione non avverrà da fuori con gli attributi nel caso di private, ma verrà attraverso qualche metodo.


    //In Java i nomi delle variabili o campi della classe sono tutte minuscole oppure se nome composto la seconda parola inizia con la maiuscola.                      
    private static final String msg = "Lezione di Ingegneria del Software";
    private static final LocalDate d = LocalDate.now();

    //static dice se l'attrbuto vive dentro la classe o dell'oggetto, qualcosa che vive dentro la classe e non dentro le singole istanze.
    //final dice che è una costante, si dichiara la variabile che prende un solo valore per tutta la durata dell'esecuzione, quando si vuole una costante si usa final.

    //String è una classe, non è un tipo primitivo
    //LocalDate è un tipo definito nelle lirerie Java

    //Le buone norme di programmazione non obbliga a mettere un costruttore

    /**
     * Metodo da cui inizia l'esecuzione del programma
     * 
     * @param args  parametri passati al metodo all'avvio della classe
     */
    public static void main(String[] args) { //Essendo che questo metodo vive nella classe (static) può vedere le variabili che vivono nella classe,
                                                //Se il metodo main istanzia una classe, può invocare i metodi associati ad essa.

        System.out.println("Hello World");
        System.out.println(msg);
        System.out.println(d);

    }

    //In Java se si deve avere un punto di avvio del programma si deve implementare in una delle classe un metodo main,
    //e deve avere questa signature: public static void main(String[] args)
    //il metodo main si trova all'interno di una classe per il linguaggio Java.

}