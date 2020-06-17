import java.util.Scanner;
class Power{
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base value");
    int base = sc.nextInt();
    System.out.println("Enter the exponent value");	
    int exponent = sc.nextInt();
    int temp = base;
    for(int i =0;i<=exponet;i++)
    {
      temp = temp*temp;
    }
    System.out.println(temp);
}   
}
		