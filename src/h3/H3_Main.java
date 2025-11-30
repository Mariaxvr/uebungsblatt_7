package h3;

public class H3_Main {
    public static void main(String[] args) {

        Mensch m = new Mensch(); // mensch as m

        m.setName("Elsa");
        m.setGebJahr(2010);
        m.setAlter();
        System.out.println("Name: " + m.getName());
        System.out.println("Geburtsjahr: " + m.getGebJahr());
        System.out.println("Alter: " + m.getAlter());
    }
}
