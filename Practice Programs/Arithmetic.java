import java.util.*;
class Arithmetic{
public static void main(String args[])
{
  Scanner sc  = new Scanner(System.in);
  int  k = sc.nextInt();
  int r = sc.nextInt();
  int sum  = k+r;
  int difference = k-r;
  int product = k*r;
  int quotient = k/r;
  int rem = k%r;
  System.out.println("Sum of two numbers is "+sum);
  System.out.println("difference of two numbers is "+difference);
  System.out.println("Product of two numbers is "+product);
  System.out.println("quotient of two numbers is "+quotient);
  System.out.println("Remainder of two numbers is "+rem);
}
}