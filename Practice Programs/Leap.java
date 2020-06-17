import java.util.*;
class Multiplication{
public static void main(String args[])
{
  Scanner sc  = new Scanner(System.in);
  int x = sc.nextInt();
  System.out.println("Multiplication table of x is "+x);
  for(int i=1;i<=15;i++)
  {
    System.out.println(x+"*"+i+"="+x*i);
  }
}
}
