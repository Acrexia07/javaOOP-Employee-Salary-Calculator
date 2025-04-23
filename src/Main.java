import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialization: Variable Declaration
        Scanner scn = new Scanner(System.in);
        int numOfEmployee;
        String employmentType;
        String name;
        int id;
        double variableInput = 0;
        double monthlySalary;
        double hourlyRate;
        double hoursWorked;
        double projectRate;
        double projectsCompleted;

        // Process: Loop until the number of employees inputted is an integer data type and not equal or less than 0.
        numOfEmployee = validateIntegerInput(scn);

        // Process: Initialize an array based on the numOfEmployee index
        Employee[] employees = new Employee[numOfEmployee];

        // Process: Loop based on how many length does the array has.
        for(int i = 0; i < employees.length ;i++){

            // Process: Validate employment type option
            do{
                System.out.print("Enter employment type (ft = full timer, p = part timer, fl = freelance): ");
                employmentType = scn.next();

                if ((!employmentType.equals("ft")) && (!employmentType.equals("p")) && (!employmentType.equals("fl"))){
                    System.out.println("Invalid Input: Enter correct option (ft, p, or fl)! Please try again.");
                }
            } while ((!employmentType.equals("ft")) && (!employmentType.equals("p")) && (!employmentType.equals("fl")));

            scn.nextLine();

            System.out.print("Enter your name: ");
            name = scn.nextLine();



            System.out.print("Enter your ID: ");
            id = scn.nextInt();

            switch(employmentType){
                case "ft" -> {

                    // Process: User input and validate user input (Double data type)
                    monthlySalary = validateDoubleInput(scn, "Monthly Salary: ", variableInput);

                    // Process: Added to array as new index
                    employees[i] = new Employee_FullTime(name, id, monthlySalary);
                }
                case "p" -> {

                    // Process: User input and validate user input (Double data type)
                    hourlyRate = validateDoubleInput(scn, "Hourly Rate: ", variableInput);

                    // Process: User input and validate user input (Double data type)
                    hoursWorked = validateDoubleInput(scn, "Hours spent: ", variableInput);

                    // Process: Added to array as new index
                    employees[i] = new Employee_PartTime(name, id, hourlyRate, hoursWorked);
                }

                case "fl" -> {

                    // Process: User input and validate user input (Double data type)
                    projectRate = validateDoubleInput(scn, "Project Rate: ", variableInput);

                    // Process: User input and validate user input (Double data type)
                    projectsCompleted = validateDoubleInput(scn, "# of Projects completed: ", variableInput);

                    // Process: Added to array as new index
                    employees[i] = new Employee_Freelance(name, id, projectRate, projectsCompleted);
                }
            }
        }

        // Output: Employees Information
        System.out.println("\nEmployee Details: ");
        for(Employee employee : employees){
            if(employee != null){
                System.out.printf("> %s (ID: %d) - Salary: $%,.2f.\n", employee.name, employee.id, employee.calculateSalary());
            }
        }

        // Exit: Close Scanner object
        scn.close();
    }

    //Method: Validation Process on Integer data type user input
    static int validateIntegerInput (Scanner scn){

        int variableInput;

        // Process: User input and validate user input (Integer data type)
        while(true){
            System.out.print("Enter number of employees: ");
            if(!scn.hasNextInt()){
                System.out.println("Invalid Input: Enter only whole numbers that are greater than 0! Please try again.");
                scn.next();
            }
            else {
                variableInput = scn.nextInt();
                if (variableInput <= 0) {
                    System.out.println("Invalid Input: Enter only positive number greater than 0! Please try again.");
                } else {
                    break; // Valid input
                }
            }
        }
        return variableInput;
    }

    //Method: Validation Process on Double data type user input
    static double validateDoubleInput (Scanner scn, String prompt, double variableInput){

        // Process: User input and validate user input (Double data type)
        while(true){
            System.out.print(prompt);
            if(!scn.hasNextDouble()){
                System.out.println("Invalid Input: Enter only whole numbers that are greater than 0! Please try again.");
                scn.next();
            }
            else {
                variableInput = scn.nextDouble();
                if (variableInput <= 0) {
                    System.out.println("Invalid Input: Enter only positive number greater than 0! Please try again.");
                } else {
                    break; // Valid input
                }
            }
        }
        return variableInput;
    }
}
