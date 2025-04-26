package Task;
import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (x): ");
        int x = sc.nextInt();

        int num = 1; 

        for (int i = 1; i <= x; i++) {
            System.out.print(num);
            if (i != x) {
                System.out.print(", ");
            }
            num += 2; 

        }
        
        sc.close();
    }
}
