
// Q7. Write a java program to accept a number from user using command line argument and display its table.


import java.util.Scanner;

public class Q7_Table 
{
    static void table(int n)
    {

        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d * %d = %d\n", n, i, n*i );
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        table(n);

        sc.close();
    }
    
}
