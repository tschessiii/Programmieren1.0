public class Uebung3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Zahl ist: " + i);

        }
        for (int j = 0; j <= 30; j = j + 2) {
            System.out.println("Zahl ist: " + j);
        }

        boolean ishaus = true;
        for (int i = 1; i <= 68; i++) {
            if (i == 10 || i == 19 || i == 28 || i == 36) {
                continue; //wenn eine der oben genannten Etagen vorkommt spring das countinue zurück in den Beginn der Schleife
            }

            System.out.println("Etage " + i);

            if (ishaus == true && i == 4) {
                break;
            }

        }

    }
}
