public class Employee_FullTime extends Employee{
    double monthlySalary;

    Employee_FullTime(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary(){
        return monthlySalary;
    }
}
