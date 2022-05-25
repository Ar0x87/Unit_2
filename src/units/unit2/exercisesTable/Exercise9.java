package units.unit2.exercisesTable;

public class Exercise9 extends Exercise8{

    int x = 9;
    Double quadx = execution(this.x)[0];

    public void writer() {

        System.out.println("Parameter x equals: " +x);
        System.out.println("The quad of parameter x equals: " +quadx.intValue());

    }
}
