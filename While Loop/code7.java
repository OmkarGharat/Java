public class Practice {

  public static void main(String[] args) {

    int i = 1;
    while (i <= 100) {

      if (i == 35) {
        break;
      }

      if (i % 5 == 0) {
        i++;
        continue;
      }

      if (i % 3 == 0 && i % 7 == 0) {
        System.out.println(i + " FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println(i + " Fizz");
      } else if (i % 7 == 0) {
        System.out.println(i + " Buzz");
      }
      i++;
    }
  }
}
