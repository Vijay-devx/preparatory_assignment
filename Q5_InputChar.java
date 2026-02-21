
/*
   Q5. Write a program to check the input characters for uppercase,
       lowercase, number of digits and other characters. Display appropriate
       message.
*/



import java.util.Scanner;

public class Q5_InputChar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        
        int ascii = sc.next().charAt(0);

        if(ascii <= 90 && ascii >= 65)
        {
            System.out.println("Uppercase");
        }

        else if(ascii >= 97 && ascii <=122)
        {
            System.out.println("Lowercase");
        }

        else if(ascii >= 48 && ascii <= 57)
        {
            System.out.println("Digit");
        }

        else
        {
            System.out.println("Other Character");
        }

        sc.close();

        
    }
    
}
