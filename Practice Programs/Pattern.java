import java.util.*;

class Palindrome {
public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalnum = num;
        int reversenum =0;
        int remainder;
         
        while( num != 0 )
        {
            remainder = num % 10;
            reversenum = reversenum * 10 + remainder;
            num  /= 10;
        }
        if (originalnum == reversedInteger)
            System.out.println(originalnum + " is a palindrome.");
        else
            System.out.println(originalnum + " is not a palindrome.");
    }
}