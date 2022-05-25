package units.unit2.exercisesTable;

public class Exercise8 implements Task{

    protected int x = 6;

    protected Double[] execution(int par){
        Double quadx = Math.pow(par, 2);
        Double cubex = Math.pow(par, 3);
        return new Double[]{quadx,cubex};
    }

    public void writer() {

        System.out.println(this.x);
        System.out.println(this.execution(x)[0].intValue());
        System.out.println(this.execution(x)[1].intValue());

    }

}
