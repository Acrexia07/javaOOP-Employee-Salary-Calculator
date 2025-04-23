public class Employee_PartTime extends Employee {

    // Initialization - Variable declaration
    double hourlyRate;
    double hoursWorked;

    // Constructor: Employee (Part time)
    Employee_PartTime(String name, int id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    //Method: Override from Parent (Employee) - Calculate Salary
    @Override
    double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

}
