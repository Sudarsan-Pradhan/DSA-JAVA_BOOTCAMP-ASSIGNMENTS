import java.util.*;

public class CalculateDistance_TwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tEnter the co-ordinate of First point");
        System.out.println("...............................................................");
        System.out.print("Enter the value of X1: ");
        int x1 = input.nextInt();
        System.out.print("Enter the value of Y1: ");
        int y1 = input.nextInt();
        System.out.println("\n");
        System.out.println("\t\tEnter the co-ordinate of Second point");
        System.out.println("...............................................................");
        System.out.print("Enter the value of X2: ");
        int x2 = input.nextInt();
        System.out.print("Enter the value of Y2: ");
        int y2 = input.nextInt();
        double dis = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("...............................................................");
        System.out.println(
                "Distance between " + "(" + x1 + "," + y1 + ")" + " and" + "(" + x2 + "," + y2 + ")" + " is " + dis);
        input.close();

    }
}
