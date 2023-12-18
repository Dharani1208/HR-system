
# HR system 

## Overview
This Java project implements a Human Resources Management System. It includes classes for employees, sales representatives, and sales managers. The project incorporates a login system, where each employee, including sales reps and managers, implements the User interface. The login system verifies credentials by checking if the provided username and password match the user's credentials.

### Classes
#### 1. User Interface
The User interface defines methods for retrieving the username and password and includes a login method to verify user credentials.


public interface User {
    String getUsername();
    String getPassword();
    boolean login(String username, String password);
}
#### 2. Employee Class
The Employee class represents a general employee in the HR system and implements the User interface.

### Methods:
timeToRetirement()

vacationTimeLeft() 

calculateBonus() 
#### 3. SalesRep Class
The SalesRep class extends the Employee class and includes additional methods specific to sales representatives.

#### Methods:
calculateCommission()

#### 4. SalesManager Class
The SalesManager class extends the Employee class and includes additional methods specific to sales managers.

Methods:
calculateCommission() 
### Main Class
The Main class serves as a testing ground for the implemented classes and methods. It creates instances of Employee, SalesRep, and SalesManager and tests their functionality, including time to retirement, vacation time left, bonus calculation, and commission calculation.

