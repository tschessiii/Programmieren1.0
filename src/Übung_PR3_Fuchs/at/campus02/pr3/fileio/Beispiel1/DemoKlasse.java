package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Beispiel1;

public class DemoKlasse {
    public static void main(String[] args) {
        AddressManager manager = new AddressManager();

        // Adressen hinzufügen
        manager.add(new Address("Max", "Mustermann", "0123456789", "max@example.com"));
        manager.add(new Address("Erika", "Mustermann", "0987654321", "erika@example.com"));

        // Adressen in CSV-Datei exportieren
        try {
            manager.exportToCsv("addresses.csv", ";");
            System.out.println("Addresses exported successfully.");
        } catch (AddressExportException e) {
            System.err.println("Error exporting addresses: " + e.getMessage());
        }

        // Adressen aus CSV-Datei laden
        try {
            manager.loadFromCsv("addresses.csv", ";");
            System.out.println("Addresses loaded successfully.");
            for (Address address : manager.getAddresses()) {
                System.out.println(address);
            }
        } catch (AddressLoadException e) {
            System.err.println("Error loading addresses: " + e.getMessage());
        }
    }
}

