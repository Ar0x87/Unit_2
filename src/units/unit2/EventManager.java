package units.unit2;

import units.unit2.exercisesTable.Task;

import java.util.Scanner;
import java.lang.*;

public class EventManager {

    public static Scanner in = new Scanner(System.in);

    public static void doWork() {

        String j;

        do {
            j = in.nextLine();
            j = j.trim();
            executer(comprehancer(j));
        }while (j.compareTo("x") != 0);
    }

    public static Integer comprehancer(String thing) {

        int translated = 0;
        boolean flag = true;

        for (int i = 0; i < thing.length(); i++) {

            if (!Character.isDigit(thing.charAt(i))) {

                flag = false;
                translated = -2;
                break;
            }

        }


        if (flag) {

            translated = Integer.parseInt(thing);

            if (!((translated > 0) && (translated < 41))) {
                translated = -1;
            }

        }

        return translated;
    }

    public static void executer(int number){

        ExercisesCollectionOperator esColOp = new ExercisesCollectionOperator();

        if (number > -1) {
            Task elt = ((Task) esColOp.station(number));
            elt.writer();
            esColOp.Enlist.clear();

        } else if (number == -1) {

            System.out.println("Invalid task number.");

        }

        if (number == -2){
            System.out.println("This is not a number.");
        }

    }

}