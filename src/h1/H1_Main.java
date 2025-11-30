package h1;

public class H1_Main {
    public static void main(String[] args) {

        Zahl z = new Zahl(); //object erstellen
        z.num = -181;

        z.setEven(); // methoden in Zahl ausrufen
        z.setPositive();
        z.setSmall();

        System.out.println("Even: " + z.even); // die boolean werte ausgeben lassen
        System.out.println("Positive: " + z.positive);
        System.out.println("Small: " + z.small);
    }
}
