package units.unit2.exercisesTable;

public class Exercise25 extends Exercise22{

    int c = (int) (Math.random() * 1000);
    int Sx = a * b;
    int Sy = b * c;
    int Sz = a * c;
    int Sc= 2 * (Sx + Sy + Sz);
    int V = a * b * c;
    int Pc = 4 * (a + b + c);

    public void writer() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
        System.out.println(V);
        System.out.println(Sx +" " +Sy +" " +Sz);
        System.out.println(Sc);
        System.out.println(Pc);
    }
}
