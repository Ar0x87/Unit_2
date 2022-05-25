package units.unit2.exercisesTable;

public class Exercise2 implements Task{

    protected String Answer = execution();

    private String execution(){
        return "-H-e-l-l-o---w-o-r-l-d-";
    }

    public void writer(){
        System.out.println(Answer);
    }
}
