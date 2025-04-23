public abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee( String name, int id){
        this.name = name;
        this.id = id;
    }

    //Method: Abstracted
    abstract double calculateSalary();
}
