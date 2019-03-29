import java.util.Scanner;

public class PatternPyramid {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Please enter the number of rows: ");
        int numberOfRows = scan.nextInt();

        // Display the pyramid
        for (int rows = 1; rows <= numberOfRows; rows++) {
            // Create spaces in each row
            for (int spaces = numberOfRows - rows; spaces >= 1; spaces--) {
                System.out.print(" "); // first space
                System.out.print(" "); // second space
            }
            // Create descending numbers in each row
            for (int lines = rows; lines >= 2; lines--) {
                System.out.print(lines + " ");
            }

            // Creating ascending numbers in each row
            for (int row = 1; row <= rows; row++) {
                System.out.print(row + " ");
            }
            // End of line
            System.out.println();
        }
    }
}
