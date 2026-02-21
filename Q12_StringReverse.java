
// Q12. Write a Program to reverse the letters present in the given String. Do not use strrev() function.


import java.util.Scanner;

public class Q12_StringReverse 
{
    static String reverse(String s)
    {
        char[] ch = s.toCharArray();

        int j = ch.length-1;

        for(int i=0; i<ch.length/2; i++)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            j--;        

        }

        String rev = new String(ch);

        return rev;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.next();

        String rev = reverse(s);

        System.out.println("Reversed String: "+rev);

        sc.close();
    }
    
}
