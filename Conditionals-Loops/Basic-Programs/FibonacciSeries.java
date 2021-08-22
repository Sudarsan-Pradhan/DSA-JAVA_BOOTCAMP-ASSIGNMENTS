import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Fibonacci Series upto an nth term.");
        System.out.println("2.Fibonacci Series upto a given range.");
        while (true) {
            try {
                System.out.println("Choose your option from the above:");
                int option = input.nextInt();
                if (option == 1 || option == 2) {
                    if (option == 1) {
                        System.out.println("Enter the number of term:");
                        int term = input.nextInt();
                        fibonacciSeries_term(term);
                    }
                    if (option == 2) {
                        System.out.println("Enter the range:");
                        int range = input.nextInt();
                        for (int i = 0; fibo(i) < range; i++) {
                            System.out.println(fibo(i) + " ");
                        }

                    }

                } else if (option == 0) {
                    break;

                } else {
                    System.out.println("You enter wrong input !! Try again😞");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input !!Program terminated....😢");
                break;
            }
            input.close();
        }
    }

    public static void fibonacciSeries_term(int t) {
        int prev = 0;
        System.out.println(prev);
        int current = 1;
        System.out.println(current);
        for (int i = 2; i < t; i++) {
            int next = prev + current;
            System.out.println(next + " ");
            prev = current;
            current = next;

        }
    }

    public static int fibo(int r) {
        if (r <= 1) {
            return r;
        } else {
            return fibo(r - 1) + fibo(r - 2);
        }

    }
}
