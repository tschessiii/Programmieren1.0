package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Beispiel1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public void add(Address a) {
        addresses.add(a);
    }

    public void exportToCsv(String path, String separator) throws AddressExportException {
        File file = new File(path);
        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException("File already exists: " + path);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Address address : addresses) {
                writer.write(address.getFirstname() + separator +
                        address.getLastname() + separator +
                        address.getMobilNumber() + separator +
                        address.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new AddressExportException("Error exporting addresses to CSV", e);
        }
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(separator);
                if (fields.length != 4) {
                    throw new AddressLoadWrongFormatException("Line does not have 4 fields: " + line);
                }
                Address address = new Address(fields[0], fields[1], fields[2], fields[3]);
                addresses.add(address);
            }
        } catch (FileNotFoundException e) {
            throw new AddressLoadException("CSV file not found: " + path, e);
        } catch (IOException e) {
            throw new AddressLoadException("Error reading CSV file", e);
        }
    }
}
