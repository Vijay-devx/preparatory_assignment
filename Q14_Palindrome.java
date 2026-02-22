
// Q14 Write a java code to check if string is palindrome.


import java.util.Scanner;

public class Q14_Palindrome 
{
    static boolean palindrome(String s)
    {
        boolean pali = true;
        int left = 0;
        int right = s.length()-1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                pali = false;
                return pali;
            }

            else
            { 
                left++;
                right--;
            }
        }

        return pali;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.next();

        if(palindrome(s))
        {
            System.out.println("Palindrome");
        }

        else
        {
            System.out.println("Not Palindrome");

        }

        sc.close();
    }
    
}
