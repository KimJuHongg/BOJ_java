import java.util.*;

class Main {
  public static void main(String[] args) {
    int a, b;
    Scanner scanner = new Scanner(System.in);

    a = scanner.nextInt();
    b = scanner.nextInt();
    
    if ( a > 0 && b > 0)
      System.out.print("1");
    else if ( a < 0 && b > 0)
      System.out.print("2");
    else if ( a < 0 && b < 0)
      System.out.print("3");
    else 
      System.out.print("4");
  }
}
