package units.unit2.exercisesTable;

public class Exercise31 implements Task{

    int weight = (int) (Math.random() * 1000);
    double velocity = (double) (Math.random() * 300000);
    double kineticEnergy = weight * Math.pow(velocity, 2) / 2;

    public void writer() {
        System.out.println("Ek = " +kineticEnergy +" joules");
        System.out.println("Ek = " +kineticEnergy/1000 +" kilojoules");
        System.out.println("Ek = " +(kineticEnergy/1000)/1000 +" Megaoules");
        System.out.println("Ek = " +((kineticEnergy/1000)/1000)/1000 +" Gigajoules");
        System.out.println("Ek = " +(((kineticEnergy/1000)/1000)/1000)/1000 +" Terrajoules");
    }
}
