package units.unit2.exercisesTable;

public class Exercise27 implements Task{

    protected int gramm = (int) (Math.random() * 1000000);

    public void writer() {
        System.out.println(gramm/1000);
    }
}
