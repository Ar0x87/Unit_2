package units.unit2.exercisesTable;

public class Exercise12 implements Task{

    int seed = 10; //(int) (Math.random() * 10);
    int flag = (seed /2) ;
    int step = seed;
    String root = "*";

    public void writer() {

        for (int k = 0; k <= seed ; k = k + 2){

            step = Math.abs(flag - k);
            System.out.println("");

            int j = 0;

            while(j < (Math.abs(flag - step))/2){
                System.out.print(" ");
                j++;
            }

            for (int i = 0; i < step + 1; i++){
                System.out.print(root);
            }

        }

        System.out.println("");

    }

}
