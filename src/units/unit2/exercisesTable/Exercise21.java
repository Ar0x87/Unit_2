package units.unit2.exercisesTable;

import java.util.ArrayList;

public class Exercise21 implements Task{

    protected int x = (int) (Math.random() * 1000);
    String vol = execution(x);


    private String execution(int iter){

        String poz="";

        while (iter != 0){
            Integer p = iter % 10;
            poz=poz.concat(p.toString());
            poz=poz.concat(" ");
            iter = iter / 10;
        }

        return poz;
    }

    public void writer() {
        System.out.println(x +" " +vol);
    }
}
