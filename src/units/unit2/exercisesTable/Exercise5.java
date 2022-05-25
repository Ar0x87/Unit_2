package units.unit2.exercisesTable;

public class Exercise5 implements Task{

    protected String Answer = execution();

    private String execution(){
        return "There is no program.";
    }

    public void writer() {
        System.out.println(Answer);
    }
}
