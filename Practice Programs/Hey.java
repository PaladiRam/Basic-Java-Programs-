import java.util.Scanner;
import java.util.Random;
  
class Attack
{
  public static void main(String[] args) 
  {
      int maxRange;
       
      Scanner sc=new Scanner(System.in);
      
      Random rand=new Random();
       
      System.out.print("Enter Value of x ");
      x=sc.nextInt();
       
      
      for(int loop=1; loop<=10; loop++)
      {
          System.out.println(rand.nextInt(x));
      }
  }
}