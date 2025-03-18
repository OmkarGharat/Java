public class NumberPattern {
    public static void main(String[] args) {
        // Loop for each row
        for (int i = 1; i <= 5; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
