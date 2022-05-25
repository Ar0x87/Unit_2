package units.unit2.exercisesTable;

public class Exercise18 extends Exercise8{

    int x = (int) (Math.random() * 100);

    public void writer() {

        System.out.println(this.x);
        System.out.println(execution(this.x)[0].intValue() +" & " +execution(this.x)[1].intValue());

    }
}
