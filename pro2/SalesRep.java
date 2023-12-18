package pro2;

public class SalesRep extends Employee {
    private int salesMade;

    public SalesRep(String username, String password, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary, int salesMade) {
        super(username, password, age, yearsWorked, daysWorked, vacationDaysTaken, salary);
        this.salesMade = salesMade;
    }

    public int calculateCommission() {
        return (int) (0.1 * salesMade);
    }
}

