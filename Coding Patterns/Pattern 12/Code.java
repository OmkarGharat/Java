public class Code {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // ^ Upper Left side
            // Left outside spaces
            for (int k = (5 - i); k >= 1; k--) {
                System.out.print(" ");
            }
            // left side stars
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                }
            }

            // left side inner spaces and stars
            for (int j = 2; j <= i; j++) {
                if (i == 5) {
                    System.out.print("*");
                }
                if (i != 5) {
                    System.out.print(" ");
                }
            }

            // ^ Upper Right Side
            // right side inner spaces and stars
            for (int j = 2; j < i; j++) {
                if (i == 5) {
                    System.out.print("*");
                }
                if (i != 5) {
                    System.out.print(" ");
                }
            }

            // Upper right side stars
            for (int j = 1; j <= i; j++) {
                if (j == 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // ^ Lower Side
        // ^ Lower Left Side
        for (int i = 4; i >= 1; i--) {

            // Right outside spaces 
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print(" ");
            }

            // right side stars 
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                }
            }

            // ^ Lower Right Side
            // right side inner spaces and stars
            for (int j = 2; j <= i; j++) {
                if (i == 5) {
                    System.out.print("*");
                }
                if (i != 5) {
                    System.out.print(" ");
                }
            }

            for (int j = i - 2; j >= 1; j--) {
                System.out.print(" ");
            }

            // Upper right side stars
            for (int j = 1; j <= i; j++) {
                if (j == 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
