public class Employee_PartTime extends Employee {

    double hourlyRate;
    double hoursWorked;

    Employee_PartTime(String name, int id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

}
