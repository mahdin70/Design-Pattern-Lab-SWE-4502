package Lab_01;

public class Employee extends Person {
    private String office;
    protected double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName() + ", Office: " + office;
    }
}
