import java.util.Scanner;

public class For_Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=1; i<11; i++){
            // System.out.println(i*n);
            System.out.println(n + "X" + i + "=" + i*n);
        }
    }   
}
