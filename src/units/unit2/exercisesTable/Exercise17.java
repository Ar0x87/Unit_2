package units.unit2.exercisesTable;

public class Exercise17 extends Exercise9 {

    int x = (int) (Math.random() * 1000);
    Double quadx = execution(x)[0];

    public void writer() {

        System.out.println(this.x);
        System.out.println(this.quadx.intValue());

    }

}
