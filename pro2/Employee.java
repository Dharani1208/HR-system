package pro2;


public class Employee implements User {
    private String username;
    private String password;
    private int age;
    private int yearsWorked;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;

    public Employee(String username, String password, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.yearsWorked = yearsWorked;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }
}
