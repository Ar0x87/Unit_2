package units.unit2.exercisesTable;

public class Exercise1 implements Task {
   protected String Answer = execution();

   private String execution(){
        return "Hello world";
   }

   public void writer(){
        System.out.println(Answer);
   }
}
