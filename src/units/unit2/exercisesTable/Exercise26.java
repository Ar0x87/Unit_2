package units.unit2.exercisesTable;

public class Exercise26 implements Task{

    int historyBegining = -40000;
    int today = 2022;
    int birthYear = historyBegining + ((int) (Math.random() * Math.abs(historyBegining))) + ((int) (Math.random() * today));

    public void writer() {
        System.out.println(birthYear);
        System.out.println(today - birthYear);
    }
}
