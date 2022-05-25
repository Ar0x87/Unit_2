package units.unit2.exercisesTable;

public class Exercise19 implements Task{

    protected int x = (int) (Math.random() * 1000);

    public void writer() {

        System.out.println((x-1) +" " +(x) +" " +(x+1));

    }

}
