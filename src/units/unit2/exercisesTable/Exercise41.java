package units.unit2.exercisesTable;

//reference to 6.7
public class Exercise41 implements Task{
    protected int x = -10000 + (int) (Math.random() * 20000);

    private int execution(int i){
        if (Math.abs(i) > 99 && i > 0){
            i = i - 1;
        }
        return i;
    }

    public void writer() {
        System.out.println(x +" " +execution(x));
    }
}