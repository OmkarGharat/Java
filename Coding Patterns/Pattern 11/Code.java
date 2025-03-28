public class Code {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int k = (4 - i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 4; i > 1; i--) {
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int j = i - 2; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
