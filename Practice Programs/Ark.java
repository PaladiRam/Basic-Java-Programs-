import java.util.Scanner;
public class Ark {
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();	
    int next;
    int first=0;
    int second =1; 
    for(int i =0;i<n;i++)
   {
      if(c<=0)
      {
        next=c;
      }
     else
     {
         next = first+second;
         first = second;
         second = next; 
     }	

  System.out.println(next); 


}
}
		