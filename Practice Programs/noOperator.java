import java.util.*;
class Leap{
public static void main(String args[])
{
  Scanner sc  = new Scanner(System.in)
  int X = sc.nextInt();
  if(X%4==0 && x%100!=0 || x%400==0)
  {
    System.out.println("X is leap year"); 
  }
  else
  {
    System.out.println("X is not leap year");
  }
}
}
