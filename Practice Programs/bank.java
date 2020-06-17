package ramith;
import java.util.*;

class Person 
{
	public static void main(String args[])
	{ 
	  System.out.println("Application for ICICI bank users");
	  System.out.println("---------------------------");
	  CreditCardAPP c1 = new Icic();
	  c1.getPersonalDetails();
	  c1.CalculatePerYearIncome(70000.0);
	  double x = c1.PrintEligibilty();
	  System.out.println("Elegibility score  for ICICI is "+(int)x);
	  System.out.println("---------------------------");
	  System.out.println("Application for HDFC bank users");
	  System.out.println("---------------------------");
	   c1 = new Hdfc();
	   c1.getPersonalDetails();
	  c1.CalculatePerYearIncome(30000.0);
	  double y = c1.PrintEligibilty();
	  System.out.println("Elegibity score calculated for Hdfc is "+(int)y);
	  System.out.println("---------------------------");
	  System.out.println("Application for Axis bank users");
	   c1 = new Axis();
	   c1.getPersonalDetails();
	  c1.CalculatePerYearIncome(70000.0);
	  double z = c1.PrintEligibilty();
	  System.out.println("Elegibility score calculated for Axis is "+(int)z);
	  System.out.println("---------------------------");
	  
	  
	}
	
}
interface CreditCardAPP 
{
  void getPersonalDetails();
  
  double CalculatePerYearIncome(double grosssalary);
  double PrintEligibilty();
}

class Icic implements CreditCardAPP
{ 
	   String name;
	   String mob;
	   String address;
	   String nominee;
	   int age;
	   String email;
	   double grosssalary;
	   double NetSalPerMonth;
	   double PerYearIncome;
	   double EMI;
	   double EligibilityScore;
	   Scanner sc = new Scanner(System.in);
	   public void getPersonalDetails()
	   {
		   System.out.println("Enter name:");
		   name = sc.nextLine();
		   System.out.println("Enter mobile number :");
		   mob = sc.nextLine();
		   System.out.println("Enter the address :");
		   address =sc.nextLine() ;
		   System.out.println("Enter the nominee :");
		   nominee = sc.nextLine();
		   System.out.println("Enter the age of person:");
		   age = sc.nextInt();
		   System.out.println("Enter the email of person");
		   email = sc.next();
		   System.out.println();
	   }
	   public double  CalculatePerYearIncome(double grosssalary)
	   {
		  
		   
		   NetSalPerMonth = grosssalary - (grosssalary * 0.2);
		   PerYearIncome = NetSalPerMonth * 12 ;
		   return PerYearIncome;
	   }
	   public double PrintEligibilty()
	   {
		   System.out.println("Enter the EMI paid");
		   EMI = sc.nextDouble();
		   
		   if(EMI == 0.000)
		   {
			  EligibilityScore = 3;
		   }
		   else if(EMI < 0.2*PerYearIncome)
		   {
			   EligibilityScore = 2;
		   }
		   else if(EMI < 0.4*PerYearIncome)
		   {
			   EligibilityScore = 1;
		   }
		   else
		   {
			   EligibilityScore = 0;
		   }
		   return EligibilityScore;
	   }
	   
}
class Hdfc implements CreditCardAPP
{ 
	   String name;
	   String mob;
	   String address;
	   String nominee;
	   int age;
	   String email;
	   double grosssalary;
	   double NetSalPerMonth;
	   double PerYearIncome;
	   double EMI;
	   double EligibilityScore;
	   Scanner sc = new Scanner(System.in);
	   public void getPersonalDetails()
	   {
		   System.out.println("Enter name:");
		   name = sc.nextLine();
		   System.out.println("Enter mobile number :");
		   mob = sc.nextLine();
		   System.out.println("Enter the address :");
		   address =sc.nextLine() ;
		   System.out.println("Enter the nominee :");
		   nominee = sc.nextLine();
		   System.out.println("Enter the age of person:");
		   age = sc.nextInt();
		   System.out.println("Enter the email of person");
		   //sc.next();
		   email = sc.nextLine();
	   }
	   public double  CalculatePerYearIncome(double grosssalary)
	   {
		  
		   
		   NetSalPerMonth = grosssalary - (grosssalary * 0.2);
		   PerYearIncome = NetSalPerMonth * 12 ;
		   return PerYearIncome;
	   }
	   public double PrintEligibilty()
	   {
		   System.out.println("Enter the EMI paid");
		   EMI = sc.nextDouble();
		   
		   if(EMI == 0.000)
		   {
			  EligibilityScore = 3;
		   }
		   else if(EMI < 0.2*PerYearIncome)
		   {
			   EligibilityScore = 2;
		   }
		   else if(EMI < 0.4*PerYearIncome)
		   {
			   EligibilityScore = 1;
		   }
		   else
		   {
			   EligibilityScore = 0;
		   }
		   return EligibilityScore;
	   }
	   
}
class Axis implements CreditCardAPP
{ 
	   String name;
	   String mob;
	   String address;
	   String nominee;
	   int age;
	   String email;
	   double grosssalary;
	   double NetSalPerMonth;
	   double PerYearIncome;
	   double EMI;
	   double EligibilityScore;
	   Scanner sc = new Scanner(System.in);
	   public void getPersonalDetails()
	   {
		   System.out.println("Enter name:");
		   name = sc.nextLine();
		   System.out.println("Enter mobile number :");
		   mob = sc.nextLine();
		   System.out.println("Enter the address :");
		   address =sc.nextLine() ;
		   System.out.println("Enter the nominee :");
		   nominee = sc.nextLine();
		   System.out.println("Enter the age of person:");
		   age = sc.nextInt();
		   //sc.next();
		   System.out.println("Enter the email of person");
		   email = sc.nextLine();
	   }
	   public double  CalculatePerYearIncome(double grosssalary)
	   {
		  
		   
		   NetSalPerMonth = grosssalary - (grosssalary * 0.2);
		   PerYearIncome = NetSalPerMonth * 12 ;
		   return PerYearIncome;
	   }
	   public double PrintEligibilty()
	   {
		   System.out.println("Enter the EMI paid");
		   EMI = sc.nextDouble();
		   
		   if(EMI == 0.000)
		   {
			  EligibilityScore = 3;
		   }
		   else if(EMI < 0.2*PerYearIncome)
		   {
			   EligibilityScore = 2;
		   }
		   else if(EMI < 0.4*PerYearIncome)
		   {
			   EligibilityScore = 1;
		   }
		   else
		   {
			   EligibilityScore = 0;
		   }
		   return EligibilityScore;
	   }
	   
}
class Hdfc implements CreditCardAPP
{ 
	   String name;
	   String mob;
	   String address;
	   String nominee;
	   int age;
	   String email;
	   double grosssalary;
	   double NetSalPerMonth;
	   double PerYearIncome;
	   double EMI;
	   double EligibilityScore;
	   Scanner sc = new Scanner(System.in);
	   public void getPersonalDetails()
	   {
		   name = sc.nextLine();
		   mob = sc.nextLine();
		   address =sc.nextLine() ;
		   nominee = sc.nextLine();
		   age = sc.nextInt();
		   //sc.next();
		   email = sc.nextLine();
	   }
	   public double  CalculatePerYearIncome(double grosssalary)
	   {
		  
		   
		   NetSalPerMonth = grosssalary - (grosssalary * 0.2);
		   PerYearIncome = NetSalPerMonth * 12 ;
		   return PerYearIncome;
	   }
	   public double PrintEligibilty()
	   {
		   System.out.println("Enter the EMI paid");
		   EMI = sc.nextDouble();
		   
		   if(EMI == 0.000)
		   {
			  EligibilityScore = 3;
		   }
		   else if(EMI < 0.2*PerYearIncome)
		   {
			   EligibilityScore = 2;
		   }
		   else if(EMI < 0.4*PerYearIncome)
		   {
			   EligibilityScore = 1;
		   }
		   else
		   {
			   EligibilityScore = 0;
		   }
		   return EligibilityScore;
	   }
	   
}
