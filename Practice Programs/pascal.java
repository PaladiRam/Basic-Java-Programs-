import java.util.*;
class Random{
  public static void main(String[] args) {
    int c;
    Random t = new Random();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (c = 1; c <= 10; c++) 
    {
      System.out.println(t.nextInt(n));
    }
  }
}