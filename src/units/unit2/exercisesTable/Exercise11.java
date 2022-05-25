package units.unit2.exercisesTable;

public class Exercise11 implements Task{

    String fio = "Ivanov Ivan Ivanovich";
    String tel = "8(800)555-35-35";
    String bor = "";
    int scale = Math.max(fio.length(), tel.length());
    int seed = Math.min(fio.length(), tel.length());

    public void writer() {

        for (int i = 0; i < scale + 2; i++){
            System.out.print("*");
        }

        System.out.println("");
        System.out.println("*" +fio +"*");

        int difference = scale - seed;

        for (int i = 0; i < difference/2; i++){
            bor = bor.concat(" ");
        }

        tel = tel.concat(bor);
        bor = bor.concat(tel);

        System.out.println("*" +bor +"*");

        for (int i = 0; i < scale + 2; i++){
            System.out.print("*");
        }

        System.out.println("");

    }

}
