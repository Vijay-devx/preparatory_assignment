
/*
 Q4. Write a program to calculate the grade of a student. There are five
     subjects. Marks in each subject are entered from keyboard. Assign grade
     based on the following rule:
     Total Marks >= 90 Grade: Ex
     90 > Total Marks >= 80 Grade: A
     80 > Total Marks >= 70 Grade: B
     70 > Total Marks >= 60 Grade: C
     60 > Total Marks Grade: F
*/


import java.util.Scanner;

public class Q4_Grade 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of sub1, sub2, sub3, sub4, sub5: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int Total_Marks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total Marks = "+Total_Marks);

        if(Total_Marks >= 90)
        {
            System.out.println("Grade: Ex");
        }

        else if(Total_Marks >= 80)
        {
            System.out.println("Grade: A");
        }

        else if(Total_Marks >= 70)
        {
            System.out.println("Grade: B");
        }

        else if(Total_Marks >= 60)
        {
            System.out.println("Grade: C");
        }

        else
        {
            System.out.println("FAIL");
        }

        sc.close();


    }
}
