package Lab_01;

public class Person {
    private String name, address, phoneNumber, emailAddress;
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + getName();
    }
}
