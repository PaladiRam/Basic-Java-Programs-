import java.util.*;
class sumDigi{
public static void main(String args[])
{
  Scanner sc  = new Scanner(System.in);
  double x = sc.nextDouble();
  int z = n%10;
  int sum;
  while(n!=0)
  {
    sum = sum+z;
    n = n/10;
  }
  System.out.println(sum); 
  
}
}
