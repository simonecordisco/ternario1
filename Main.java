
//Copia il seguente programma Java e sostituisci il costrutto if-else con l'operatore ternario
public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è "));
    }

     private static String checkString(String value) {
        String result = value.length() >= 10 ?"Lunghezza maggiore o uguale di 10":"Lunghezza minore di 10";
        return result;
    }
}