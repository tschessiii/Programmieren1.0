package Übungen_PR1_Gerzic.AllgemeineÜbungen;

public class Schaltjahr {

    public static void main(String[] args) {
        int StartJahr = 2024;
        int NummernCheck = 100;

        System.out.println("Schaltjahre für die nächsten 100 Jahre ab dem Jahr " + StartJahr + " sind: ");
        for (int jahr = StartJahr; jahr < StartJahr + NummernCheck; jahr++) {
            if (Schaltjahr(jahr)){
                System.out.println(jahr);
            }
        }
    }


    public static boolean Schaltjahr(int jahr) {
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                return jahr % 400 == 0;
            }else{
                return true;
            }
        }
        return false;
    }
}
