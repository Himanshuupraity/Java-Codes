
import java.util.Scanner;

public class function_voteOrNot {
    public static void elegible(int a){
        if (a>=18){
            System.out.println("Candidate can vote");
        } else{
            System.out.println("Candidate do not vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age - ");
        int a = sc.nextInt();
        
        elegible(a);
    }
}
