package units.unit2.exercisesTable;

public class Exercise32 implements Task{

    int chislo = (int) (Math.random() * 1000);
    double obrChislo = Math.pow(chislo, -1);

    public void writer() {
      System.out.println(chislo);
      System.out.println("1/" +chislo);
      System.out.println(obrChislo);
    }
}
