package units.unit2.exercisesTable;

public class Exercise30 implements Task{

    protected int hours = (int) (Math.random() * 24);
    protected int minutes = (int) (Math.random() * 60);
    protected int[] time = {hours, minutes};

    private int[] execution(){

        int fromMidnight = hours * 60 + minutes;
        int toMidnight = 24 * 60 - fromMidnight;
        return new int[]{fromMidnight, toMidnight};
    }

    public void writer() {
        System.out.println(time[0] +":" +time[1] +" now.");
        System.out.println(execution()[0] * 60 +" seconds have passed since last midnight.");
        System.out.println(execution()[0] +" minutes have passed since last midnight.");
        System.out.println(execution()[1] + " minutes left to next midnight.");
        if (execution()[1] == 2){
            System.out.println("Playing Iron Maiden - 2 minutes to Midnight.");
        }
    }
}
