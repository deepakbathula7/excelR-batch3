import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double pf = scanner.nextDouble();

        
        double annualSalary = monthlySalary * 12;

       
        double deductions = hra * 12 + pf * 12;

       
        double taxableIncome = annualSalary - deductions;

        
        double tax = 0;

       
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = 50000 + (taxableIncome - 500000) * 0.20; 
        } else {
            tax = 150000 + (taxableIncome - 1000000) * 0.30; 

       
        System.out.println("Annual Taxable Income: Rs " + taxableIncome);
        System.out.println("Annual Income Tax: Rs " + tax);
        
       
        scanner.close();
    }
    }
}