package units.unit2.exercisesTable;

public class Exercise16 implements Task {

    protected int x = (int) (Math.random() * 1000);

    protected int[] execution(int par){
        return new int[]{ par+6 , par-12 };
    }

    public void writer() {
        System.out.println(x);
        System.out.println(execution(x)[0]);
        System.out.println(execution(x)[1]);
    }
}
