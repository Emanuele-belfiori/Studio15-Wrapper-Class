import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wrapper Class: ");
        System.out.println();

        /*
        * Wrapper Class:
        *
        * - Ci permettono di utilizzare dati primitivi come reference
        *
        * - boolean---> Boolean
        *
        * - char---> Character
        *
        * - int---> Integer
        *
        * - double---> Double
         */

/*----------------------------------------------------------------------------------------------------*/

        /* La differenza tra dati primitivi Es: int numero= 1; non ci permettono di utilizzare dei i
        metodi || Invece reference come le Stringhe Es: String x = "Alessandro"; ci permetterà di utilizzare
        dei metodi || Le wrapper class saranno però molto più lente delle primitive (PERCHè TRATTATE COME
        PRIMITIVE MA IMPACCHETTATE IN REFERENCE (Autoboxing CHE DARA QUINDI LA POSSIBILITà DI AVERE ACCESSO
        AI METODI, PER POI SPACCHETTARLE (Unboxing) PER RENDERE IL VALORE PRIMITIVO CHE SAREBBE INFINE
        QUELLO REALE)
         */

/*-----------------------------------------------------------------------------------------------------*/

        // COME SCRIVERE LE WRAPPER CLASS:

        Boolean vero = true; //Reference (Autoboxing)
        boolean falso = true; //Primitivo
        // Come possiamo vedere vengono accettati entrambi senza generare nessun errore

        String stringa = "Ciao"; //Original Reference

        Character carattere = 'a'; //Transformed into reference (Autoboxing)
        Integer numero = 5; //Transformed into reference (Autoboxing)
        Double virgola = 5.23; //Transformed into reference (Autoboxing)
        // Tutte queste variabili ora possono accedere ognuna ai dei metodi!

/*------------------------------------------------------------------------------------------------------*/

        // COMPARAZIONE:

        // In questo caso facciamo la comparazione delle variabili primitive con le reference

        boolean a = true;
        char b = 'a';
        int c = 5;
        double d = 5.23;

        Scanner scanner = new Scanner(System.in); // Richiamo classe scanner
        System.out.println("Per avviare il programma di verifica inseriamo il numero 1:");
        int verifica= scanner.nextInt(); // Inserimento utente per confronto variabili

        switch (verifica){// Non mettendo il break a ogni fine case, il programma esguirà tutti i case insieme
            case 1:
                if (vero == a){ // Dimostrazione (Boolean vero [Unboxing]) è identica (boolean a)
                    System.out.println("Corretto-1");
                }
            case 2:
                if (carattere == b) { // Character carattere [Unboxing] == char b
                    System.out.println("Corretto-2");
                }
            case 3:
                if (numero == c) { // Integer numero [Unboxing] == int c
                    System.out.println("Corretto-3");
                }
            case 4:
                if (virgola == d) { // Double virgola [Unboxing] == double d
                System.out.println("Corretto-4");
            }
        } // Fine switch
    }
}