/*
      Q9. Accept an integer number and when the program is executed print the
          binary, octal and hexadecimal equivalent of the given number.
          Sample Output:
          terminal> java Test
          Enter Number : 20
          Given Number :20
          Binary equivalent :10100
          Octal equivalent :24
          Hexadecimal equivalent :14

          Hint: Use bitwise operators for binary conversion. Octal/Hexadecimal
          conversion to be done by repetitive division using recursion
*/


import java.util.Scanner;

public class Q9_NumberConversion 
{
    static void conversion(int n)
    {
        int[] binary = new int[50];

        int[] octal = new int[50];

        int[] hexa = new int[50];

        //Binary execution

        int bincount = 0;
        int binQ;
        int binN = n;
    
        do
        {
            int binrem = binN % 2;
            binQ = binN / 2;
            
            binary[bincount] = binrem;
            binN = binQ;
            
            bincount++;
            
        }
        while(binQ > 0);

        System.out.print("Binary Equivalent:  ");

        for(int i = bincount-1; i >= 0; i--)
        {
            System.out.print(binary[i]+" ");
        }

        System.out.println();


        //octal execution

        int octcount = 0;
        int octQ;
        int octN = n;

        do
        {
            int octrem = octN % 8;
            octQ = octN /8 ;

            octal[octcount] = octrem;
            octN = octQ;

            octcount++;

        }
        while(octQ > 0);

        System.out.print("Octal Equivalent: ");

        for(int i = octcount-1; i >= 0 ; i--)
        {
            System.out.print(octal[i]+" ");
        }

        System.out.println();

        // Hexadecimal execution

        int hexacount = 0;
        int hexQ;
        int hexN = n; 

        do
        {
            int hexrem = hexN % 16;
            hexQ = hexN / 16;

            hexa[hexacount] = hexrem;
            hexN = hexQ;

            hexacount++;

        }
        while(hexQ > 0);

        System.out.print("Hexadecimal Equivalent: ");

        for(int i = hexacount-1; i >= 0; i--)
        {
            if(hexacount<10)
            {
               System.out.print(hexa[i]+" ");
            }

            else
            {
                System.out.println((char)(hexa[i]-10+'A'));
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        
        int n = sc.nextInt();

        System.out.println("Given Number: "+n);

        conversion(n);

        sc.close();
    }
    
}
