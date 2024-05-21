package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue11.without_exception;


public class Product {

    public String ProductName;
    public Double Price;
    public String ProductCategory;

    public Product(String productName, Double price, String productCategory) {
        ProductName = productName;
        Price = price;
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}