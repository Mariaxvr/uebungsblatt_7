package p1;

public class P1_Main {

    public static void main(String[] args) {
        System.out.println("Teil a: ");

        multFrac(5, 2, 3, 4);

        System.out.println("Teil d: ");
        Bruch a = new Bruch(5, 2);
        Bruch b = new Bruch(3, 4);
        multFrac(a, b);
    }

    // a
    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zaehler = z1 * z2;
        int nenner = n1 * n2;
        System.out.println(zaehler + ":" + nenner);
    }

    // c
    public static void multFrac(Bruch a, Bruch b) {
        multFrac(a.z, a.n, b.z, b.n);
    }
}

