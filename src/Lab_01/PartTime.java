package Lab_01;

public class PartTime extends Staff {
    private int workedHours;
    private double hourlyRate;

    public PartTime(String name, String address, String phoneNumber, String emailAddress,
                    String office, MyDate dateHired, String title, int workedHours, double hourlyRate) {
        super(name, address, phoneNumber, emailAddress, office, 0, dateHired, title);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
        calculateSalary();
    }

    private void calculateSalary() {
        salary = workedHours * hourlyRate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName() + ", Worked Hours: " + workedHours + ", Hourly Rate: " + hourlyRate;
    }
}
