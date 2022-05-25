package units.unit2;

import units.unit2.exercisesTable.*;
import java.util.Vector;

public class ExercisesCollectionOperator {

    Vector<Task> Enlist = new Vector<>(38);

    public ExercisesCollectionOperator() {
        Enlist.add(0, new   Exercise1());
        Enlist.add(1, new   Exercise2());
        Enlist.add(2, new   Exercise3());
        Enlist.add(3, new   Exercise4());
        Enlist.add(4, new   Exercise5());
        Enlist.add(5, new   Exercise6());
        Enlist.add(6, new   Exercise7());
        Enlist.add(7, new   Exercise8());
        Enlist.add(8, new   Exercise9());
        Enlist.add(9, new  Exercise10());
        Enlist.add(10,new  Exercise11());
        Enlist.add(11,new  Exercise12());
        Enlist.add(12,new  Exercise13());
        Enlist.add(13,new  Exercise14());
        Enlist.add(14,new  Exercise15());
        Enlist.add(15,new  Exercise16());
        Enlist.add(16,new  Exercise17());
        Enlist.add(17,new  Exercise18());
        Enlist.add(18,new  Exercise19());
        Enlist.add(19,new  Exercise20());
        Enlist.add(20,new  Exercise21());
        Enlist.add(21,new  Exercise22());
        Enlist.add(22,new  Exercise23());
        Enlist.add(23,new  Exercise24());
        Enlist.add(24,new  Exercise25());
        Enlist.add(25,new  Exercise26());
        Enlist.add(26,new  Exercise27());
        Enlist.add(27,new  Exercise28());
        Enlist.add(28,new  Exercise29());
        Enlist.add(29,new  Exercise30());
        Enlist.add(30,new  Exercise31());
        Enlist.add(31,new  Exercise32());
        Enlist.add(32,new  Exercise33());
        Enlist.add(33,new  Exercise34());
        Enlist.add(34,new  Exercise35());
        Enlist.add(35,new  Exercise36());
        Enlist.add(36,new  Exercise37());
        Enlist.add(37,new  Exercise38());
        Enlist.add(38,new  Exercise39());
        Enlist.add(39,new  Exercise40());
    }



    public Object station(final int number) {
            return Enlist.elementAt(number - 1);
    }

}