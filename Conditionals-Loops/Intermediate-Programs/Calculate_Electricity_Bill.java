import java.util.Scanner;

/**
 * Calculate_Electricity_Bill
 */
public class Calculate_Electricity_Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your unit: ");
        int unit = input.nextInt();
        int Units = calculate_Electricity(unit);
        System.out.println("Your total electric bill is: "+ Units);
        input.close();
        
    }
    public static int calculate_Electricity(int Unit){
        if (Unit > 1 && Unit <=100) {
          return  Unit * 10;
        } else if (Unit > 100 && Unit <= 200){
           return  (100 * 10)+(Unit-100)*15;
        } else if (Unit > 200 && Unit <= 300){
           return  (100 * 10)+(100*15)+(Unit-200)*20;
        } else if (Unit > 300){
           return  (100 * 10)+(100*15)+(100*20)+(Unit-300)*25;
        }else{
            System.out.println("Enter valid Unit...!!");
            
        }
        return 0;
    }
    


}