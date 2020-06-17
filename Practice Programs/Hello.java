import java.util.*;
class Equal
{
  public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int y = sc.nextInt();
   int sum = x+y;
   int z = sc.nextInt();
   boolean a = true;
   if(z!=sum)
   {
       a=false;
   }
   if(a)
   {
    System.out.println("True");
   }
   else
   {
    System.out.println("False");
   }
  }
}
      