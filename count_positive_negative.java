import java.util.Scanner;

public class count_positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        String choice;

        do { 
            System.out.print("Enter the number - ");
            int a = sc.nextInt();

            if (a>0){
                positive++;
            } else if (a < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.next();
            
            
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}
