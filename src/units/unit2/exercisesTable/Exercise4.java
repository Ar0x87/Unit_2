package units.unit2.exercisesTable;

public class Exercise4 implements Task {

    public void writer() {

        for (int i = 0; i <= 2; i++){
            System.out.print("+");
        }

        for (int i = 0; i <= 3; i++){
            System.out.print("!");
        }

        for (int i = 0; i <= 1; i++) {
            System.out.print("?");
        }

        System.out.println("");

    }
}
