/*
 *
 *
 *
 *
 *
 *
 */


package units.unit2;

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Here you see list of the exercises.");

        for (int i = 1; i < 40; i++) {
            System.out.println("2." + i);
        }

        System.out.println("Enter second number to execute selected task.");

        EventManager lifeTime = new EventManager();
        lifeTime.doWork();
    }
}