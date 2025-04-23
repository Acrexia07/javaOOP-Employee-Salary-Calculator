public class Employee_FullTime extends Employee{

    // Initialization - Variable declaration
    double monthlySalary;

    // Constructor: Employee (Full time)
    Employee_FullTime(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    //Method: Override from Parent (Employee) - Calculate Salary
    @Override
    double calculateSalary(){
        return monthlySalary;
    }
}
