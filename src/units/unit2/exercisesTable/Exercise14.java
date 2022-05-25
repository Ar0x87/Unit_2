package units.unit2.exercisesTable;

public class Exercise14 implements Task{

    protected int randomX = (int) (Math.random() * 1000);

    protected int execution(int x){
        return x + 10;
    }

    public void writer() {
        System.out.println("The random number equals: " +randomX );
        System.out.println("After 10: " +this.execution(this.randomX));
    }
}
