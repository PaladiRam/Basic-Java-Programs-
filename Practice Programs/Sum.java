import java.util.Scanner;
class Multis{
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value of n");
   int n = sc.nextInt();
   System.out.println("Multiplication Table of " + n);
   for(int i=1;i<=n;i++)
   {
     System.out.println(n+"*"+i+"="+n*i); 
   }
   
      
    
}
}
		