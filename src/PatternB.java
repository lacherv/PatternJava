import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
        int numberOfRows;
        System.out.print("Please enter the number of rows: ");
        Scanner scan = new Scanner(System.in);
        numberOfRows = scan.nextInt();

        for (int i = numberOfRows; i >= 1 ; --i) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
