import java.util.Scanner;
public class Ark {
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();	
    int temp = n;
    int sum =0;
    while(n!=0)
   {
      int z = n%10;
      sum = sum+z*z*z;
       n=n/10;  
   }	
if(temp==sum)
{
  System.out.println("The given number is Armstrong number");
}
else
{
   System.out.println("No the given number is not Armstrong number");
}

}
}
		