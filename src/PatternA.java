import java.util.Scanner;

public class PatternA {

    public static void main(String[] args) {
        int numberOfRows;
        System.out.print("Please enter the number of rows: ");
        Scanner scan = new Scanner(System.in);
        numberOfRows = scan.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
