package units.unit2.exercisesTable;

public class Exercise36 implements Task{

    String passagir = "X-ray engine";
    String viletaetV = "рабочий стол";

    @Override
    public void writer() {
        System.out.println("Пассажир " +passagir +" вылетает в " +viletaetV +".");
    }
}
