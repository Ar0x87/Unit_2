package units.unit2.exercisesTable;
//reference to 7.6
public class Exercise40 implements Task{

    protected int first = (int) (Math.random() * 1000);
    protected int second = (int) (Math.random() * 1000);
    String res;

    private String WhichOne(int x, int y) {
        if (x == y) {
            res = "Numbers are equal";
        } else {
            if (x > y) {
                res = "First number is bigger";
            }
            if (x < y) {
                res = "First number is smaller";
            }
        }
        return res;
    }

    public void writer() {
        System.out.println(WhichOne(first, second));
    }
}
