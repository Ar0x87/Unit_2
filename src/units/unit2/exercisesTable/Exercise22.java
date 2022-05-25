package units.unit2.exercisesTable;

public class Exercise22 implements Task{

    int a = (int) (Math.random() * 1000);
    int b = (int) (Math.random() * 1000);

    public void writer() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("");
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(b-a);
    }
}
