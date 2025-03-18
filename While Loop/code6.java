public class Project3 {
  public static void main(String[] args) {
    
    int i = 1;
    while (i <= 50) {

      if (i == 35) {
        break;
      }

      if (i % 5 == 0) {
        i++;
        continue;
      }

      System.out.println(i);
      i++;
    }
  }
}
