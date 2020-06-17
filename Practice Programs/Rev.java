import java.util.*;
class Rev
{
 public static void main(String args[])
 { 
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int reverse = 0;
   while(x!=0)
  {
     int z = x%10;
     reverse = reverse*10;
     reverse = reverse+z;
     x=x/10;
  }
  System.out.println(reverse);
 }
} 
   