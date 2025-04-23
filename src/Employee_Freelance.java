public class Employee_Freelance extends Employee {

    // Initialization - Variable declaration
    double projectRate;
    double projectsCompleted;

    // Constructor: Employee (Freelance)
    Employee_Freelance(String name, int id, double projectRate, double projectsCompleted){
        super(name, id);
        this.projectRate = projectRate;
        this.projectsCompleted = projectsCompleted;
    }

    //Method: Override from Parent (Employee) - Calculate Salary
    @Override
    double calculateSalary(){
        return projectRate * projectsCompleted;
    }
}
