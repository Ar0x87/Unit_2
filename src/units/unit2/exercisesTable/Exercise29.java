package units.unit2.exercisesTable;

public class Exercise29 implements Task{

    int time = (int) (Math.random() * 24);

    public void writer() {
        System.out.println(time);
        System.out.println(time*3600);
    }
}
