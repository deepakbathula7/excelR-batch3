import java.util.Scanner;

public class Demo019 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter your monthly HRA: ");
        double monthlyHRA = scanner.nextDouble();

        System.out.print("Enter your monthly PF: ");
        double monthlyPF = scanner.nextDouble();

       
        double annualSalary = monthlySalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;

        
        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;

  
        double tax = calculateTax(taxableIncome);

       
        System.out.println("\n--- Tax Details ---");
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Annual Tax: Rs " + tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 500000) {
            tax = income * 0.10;
        } else if (income <= 1000000) {
            tax = 500000 * 0.10 + (income - 500000) * 0.20;
        } else {
            tax = 500000 * 0.10 + 500000 * 0.20 + (income - 1000000) * 0.30;
        }

        return tax;
    }
}
