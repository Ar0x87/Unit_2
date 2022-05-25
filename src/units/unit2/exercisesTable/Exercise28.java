package units.unit2.exercisesTable;

public class Exercise28 implements Task{

    int cabeltov = (int) (Math.random() * 1000000);
    double meters = cabeltov/185.2;

    @Override
    public void writer() {
        System.out.println("Distance, cabeltov = " +cabeltov);
        System.out.println("Distance, meters = " +meters);
        System.out.println("Distance, kilometers = " +meters/1000);
    }
}
