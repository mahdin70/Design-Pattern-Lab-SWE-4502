package Lab_01;

public class Main {
    public static void main(String[] args) {
        MyDate hiringDate = new MyDate(2022, 8, 17);

        Person person = new Person("Mukit", "Gazipur", "01764257445", "mukit@gmail.com");
        Student student = new Student("Mamun", "BoardBazar", "01764257445", "mamun@gmail.com", "Freshman");
        Faculty faculty = new Faculty("Nibir", "Uttara", "01764257445", "nibir@gmail.com",
                "101", 60000, hiringDate, "9 AM - 5 PM", "Professor");
        Employee employee = new Employee("Maruf", "Malibagh", "01764257445", "maruf@gmail.com",
                "201", 50000, hiringDate);
        Staff staff = new Staff("Sadaf", "Hatirjheel", "01764257445", "sadaf@gmail.com",
                "301", 40000, hiringDate, "Assistant Registrar");
        FullTime fullTimeStaff = new FullTime("Tamzid", "890 Birch St", "01764257445", "tamzid@gmail.com",
                "401", 60000, hiringDate, "Registrar");
        PartTime partTimeStaff = new PartTime("Dayan", "901 Oak St", "01764257445", "dayan@gmail.com",
                "501", hiringDate, "Gardener", 20, 15.0);

        System.out.println(person);
        System.out.println(student);
        System.out.println(faculty);
        System.out.println(employee);
        System.out.println(staff);
        System.out.println(fullTimeStaff);
        System.out.println(partTimeStaff);
    }
}

