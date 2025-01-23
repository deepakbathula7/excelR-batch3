import java.util.Scanner;

public class Demo026{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter the number of minutes:");
        long minutes = scanner.nextLong();
        
    
        int minutesPerDay = 60 * 24;
        int minutesPerYear = minutesPerDay * 365;

        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;


        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
    
        scanner.close();
    }
}