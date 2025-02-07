import java.util.*;

class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    // Method to compute bowling average
    public void computeBowlingAverage() {
        if (validateInputs()) {
            if (wickets > 0) {
                double bowling_avg = (double) runs_conceded / wickets;
                System.out.println("Name: " + name);
                System.out.println("bowling_avg=" + bowling_avg);
            } else {
                System.out.println("Error");
            }
        }
    }

    // Method to show statistics
    public void showStatistics() {
        if (validateInputs()) {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + balls_bowled);
            System.out.println("runs_conceded=" + runs_conceded);
        }
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (validateInputs()) {
            if (balls_bowled > 0) {
                double strike_rate = (double) runs_conceded / balls_bowled;
                System.out.println("Name: " + name);
                System.out.println("Strike_rate=" + strike_rate);
            } else {
                System.out.println("Error");
            }
        }
    }

    // Method to validate inputs
    private boolean validateInputs() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return false;
        }
        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}

public class PS003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name = ");
        String name = sc.next();
        System.out.print("wickets = ");
        int wickets = sc.nextInt();
        System.out.print("matches = ");
        int matches = sc.nextInt();
        System.out.print("balls_bowled = ");
        int balls_bowled = sc.nextInt();
        System.out.print("runs_conceded = ");
        int runs_conceded = sc.nextInt();

        Bowler bowler = new Bowler(name,wickets,matches,balls_bowled,runs_conceded);
        bowler.computeBowlingAverage();
        System.out.println();
        bowler.showStatistics();
        System.out.println();
        bowler.computeStrikeRate();
    }
}