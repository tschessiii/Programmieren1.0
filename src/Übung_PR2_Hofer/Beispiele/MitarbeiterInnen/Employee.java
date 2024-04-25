
package Übung_PR2_Hofer.Beispiele.MitarbeiterInnen;

public class Employee {
    protected String lastname, firstname, department;
    protected double baseSalary;
    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary()
    {
        return baseSalary;
    }
}
