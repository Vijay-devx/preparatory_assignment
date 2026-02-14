
// Q2. Write a program to calculate Factorial of a number.


import java.util.Scanner;

public class Factorial 
{
    static int factorial(int n)
    {
        int fac = 1;

        for(int i=n; i>=1; i--)
        {
            fac = fac * i;
        }

        return fac;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number who's factorial you want: ");
        int n = sc.nextInt();

        System.out.println("Factorial = "+factorial(n));

        sc.close();
        
    }
    
}
