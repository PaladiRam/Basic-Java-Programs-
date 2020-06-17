import java.util.Scanner;
class Swap{
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
    int first_no = sc.nextInt();	
    int second_no = sc.nextInt();
    int temp = first_no;
    first_no = second_no;
    second_no = temp;
    System.out.println(first_no);
    System.out.println(second_no);
}   
}
		