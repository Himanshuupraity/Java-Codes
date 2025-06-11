import java.util.Scanner;

public class functio_greaterNoFrom2 {
    

    public static void greaterNo(int a, int b){
        if(a==b){
            System.out.print("Both the numbers are equal");
            
        } else if(a<b){
            System.out.print("Greater number is- "+ b);
        } else{
            System.out.print("Greater number is- " + a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number - ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number - ");
        int b = sc.nextInt();

        greaterNo(a, b);
    }
}
