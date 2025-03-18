public class Practice {
  public static void main(String[] args) {

    System.out.println("Enter a number : ");
    Scanner numScanner = new Scanner(System.in);

    while (true) {
      if (numScanner.hasNextInt()) {
        var num = numScanner.nextInt();
        if (num > 0 && num < 101) {
          System.out.println("Valid number");
          break;
        } else {
          System.out.println("Number is out of range, cannot proceed.");
          break;
        }
      } else {
        System.out.println("Please enter a valid number!");
        numScanner.nextLine();
      }
    }

  }
}
