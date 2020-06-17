import java.util.Scanner;
import java.util.Random;
  
class Attack
{
  public static void main(String[] args) 
  {
      int x;
   
      Scanner sc=new Scanner(System.in);
      
      RandomUtils random = new RandomUtils();
       
      System.out.print("Enter Value of x ");
      
       
      
      for(int i=1; i<=10; i++)
      {
          System.out.println(random.nextInt(10,100));
      }
  }
}