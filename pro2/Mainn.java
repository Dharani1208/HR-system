package pro2;

public class Mainn {
    public static void main(String[] args) {
        Employee employee = new Employee("john_doe", "password123", 30, 5, 180, 10, 50000.0);
        SalesRep salesRep = new SalesRep("jane_smith", "salesPass", 25, 3, 150, 5, 60000.0, 50);
        SalesManager salesManager = new SalesManager("manager1", "managerPass", 40, 10, 250, 15, 80000.0, 1000);

        // Testing employee methods
        System.out.println("Time to Retirement: " + employee.timeToRetirement());
        System.out.println("Vacation Time Left: " + employee.vacationTimeLeft());
        System.out.println("Bonus: $" + employee.calculateBonus());

        // Testing SalesRep methods
        System.out.println("Commission for SalesRep: $" + salesRep.calculateCommission());

        // Testing SalesManager methods
        System.out.println("Commission for SalesManager: $" + salesManager.calculateCommission());

        // Testing login
        System.out.println("Login result for employee: " + employee.login("john_doe", "password123"));
        System.out.println("Login result for salesRep: " + salesRep.login("jane_smith", "salesPass"));
        System.out.println("Login result for salesManager: " + salesManager.login("manager1", "managerPass"));
    }
}
