import java.util.*;

class Client{
    private double basePay;
    private int hoursWorked;
    Client(){
        basePay=0.0;
        hoursWorked=0;
    }
    Client(double basePay, int hoursWorked){
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }
    void ComputeSalary(){
        double totalSalary=0;
        if(basePay<8.00||hoursWorked<40||hoursWorked>60){
            System.out.println("Error");
            return ;
        }
        if (hoursWorked>40&&hoursWorked<60){
            int remHours = hoursWorked - 40;
            totalSalary = (40*basePay)+(remHours*(1.5*basePay));
            System.out.println("Total Salary: $"+totalSalary);
        }else if(hoursWorked==40){
            totalSalary=hoursWorked*basePay;
            System.out.println("Total Salary: $"+totalSalary);
        }
    }
}
class PS004{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base pay: $");
        double basePay = sc.nextDouble();
        System.out.print("Enter number of hours worked: ");
        int hoursWorked = sc.nextInt();
        Client obj = new Client(basePay, hoursWorked);
        obj.ComputeSalary();
    }
}