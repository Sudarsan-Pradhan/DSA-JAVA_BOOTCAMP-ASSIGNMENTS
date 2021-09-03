import java.io.*;

/**
 * Calculate_Batting_Average
 */
public class Calculate_Batting_Average {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of run scored: ");
        int runScore = Integer.parseInt(input.readLine());
        System.out.println("Enter number of Innings played:");
        int inningsPlayed = Integer.parseInt(input.readLine());
        System.out.println("Enter number of times not out:");
        int notOut = Integer.parseInt(input.readLine());
        int BattingAverage = runScore / (inningsPlayed - notOut);
        System.out.println("So the Batting average is :" + BattingAverage);

    }
}