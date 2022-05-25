package units.unit2.exercisesTable;

public class Exercise10 implements Task{

    protected int a = 0;
    protected int b = 1000;
    protected int[] Answer = execution();

    private int[] execution(){

        int randomNumber1 = a + (int) (Math.random() * b);
        int randomNumber2 = a + (int) (Math.random() * b);
        int randomMultiplication = randomNumber1 * randomNumber2;
        int randomSummary = randomNumber1 + randomNumber2;
        return new int[]{randomNumber1,randomNumber2,randomMultiplication,randomSummary};

    }

    public void writer() {

        System.out.println("The values of two random parameters are " +Answer[0] +" and " +Answer[1]);
        System.out.println("The multiplication of them, equals " +Answer[2]);
        System.out.println("The summary of them, equals " +Answer[3]);

    }
}

