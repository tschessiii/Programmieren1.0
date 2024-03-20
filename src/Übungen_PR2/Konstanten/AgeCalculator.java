package Übungen_PR2.Konstanten;

public class AgeCalculator {

        //final = man kann es nicht mehr verändern
        //static = macht das man sie nur in dieser Klasse verwenden kann
        //static final beschrieb eine Konstante
        static final int DAYS_IN_A_YEAR= 365;
        static final int WEEKS_IN_A_YEAR =52;
        static final int MONTHS_IN_A_YEAR =12;

        //Berechnung des Alters in Tage
        public int ageInDay(int age){
            return age * DAYS_IN_A_YEAR;
        }

        //Berechnung des Alters in Wochen
        public int ageInWeeks(int age){
            return age * WEEKS_IN_A_YEAR;
        }

        //Berechnung des Alters in Wochen
        public int ageInMonths(int age){
            return age * MONTHS_IN_A_YEAR;
        }
}
