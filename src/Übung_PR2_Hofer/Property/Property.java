package Übung_PR2_Hofer.Property;

public class Property implements Comparable<Property> {

    private String owner;
    private double area;
    private String cadastrenumber;
    private String zipcode;

    //Constructor
    public Property(String owner, double area) {
        this.owner = owner;
        this.area = area;
        cadastrenumber = " ";
        zipcode = "";
    }


    //Getter und Setter
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCadastrenumber() {
        return cadastrenumber;
    }

    public void setCadastrenumber(String cadastrenumber) {
        this.cadastrenumber = cadastrenumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    //Aufsteigend nach Areas sortieren
    @Override
    public int compareTo(Property o) {
        if(this.area < o.area){
            return -1;
        }
        if(this.area > o.area){
            return 1;
        }
        return 0;
    }
}
