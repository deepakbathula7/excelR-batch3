
class Employee {
    String name;
    String empId;


    public Employee() {
        this.name = "";
        this.empId = "";
    }

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }
}


class FulltimeEmployee extends Employee {
    double basic;
    double bonus;

   
    public FulltimeEmployee() {
        super(); 
        this.basic = 0.0;
        this.bonus = 0.0;
    }

    
    public FulltimeEmployee(String name, String empId, double basic, double bonus) {
        super(name, empId); 
        this.basic = basic;
        this.bonus = bonus;
    }

    
    public double computeSal() {
        return basic + bonus;
    }

   
    public void showDetails() {
        System.out.println("Fulltime Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + computeSal());
    }
}


class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

   
    public PartTimeEmployee() {
        super();
        this.hourlyRate = 0.0;
        this.hoursWorked = 0;
    }

    public PartTimeEmployee(String name, String empId, double hourlyRate, int hoursWorked) {
        super(name, empId); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   
    public double computeSal() {
        return hourlyRate * hoursWorked;
    }

   
    public void showDetails() {
        System.out.println("Part-time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + computeSal());
    }
}


public class EmployeeDetails {
    public static void main(String[] args) {
        
        FulltimeEmployee fullTimeEmp = new FulltimeEmployee("deepak", "patel", 60000, 7000);
        fullTimeEmp.showDetails();

        
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("bharath", "kumar", 50, 120);
        partTimeEmp.showDetails();
    }
}