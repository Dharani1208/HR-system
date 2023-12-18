package pro2;

public class SalesManager extends Employee {
    private int teamSales;

    public SalesManager(String username, String password, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary, int teamSales) {
        super(username, password, age, yearsWorked, daysWorked, vacationDaysTaken, salary);
        this.teamSales = teamSales;
    }

    public int calculateCommission() {
        return (int) (0.03 * teamSales);
    }
}
