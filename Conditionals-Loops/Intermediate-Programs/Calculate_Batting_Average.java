import java.io.*;

/**
 * Calculate_Batting_Average
 */
public class Calculate_Batting_Average {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of runs scored:");
        int runScored = Integer.parseInt(input.readLine());
        System.out.println("Enter number innings played:");
        int inningsPlayed = Integer.parseInt(input.readLine());
        System.out.println("Enter number of times of runout:");
        int notOut = Integer.parseInt(input.readLine());
        int averageBatting = runScored / (inningsPlayed - notOut);
        System.out.println("Batting average =" + averageBatting);

    }
}