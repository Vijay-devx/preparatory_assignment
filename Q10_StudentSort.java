
/*
     Q10. Read at most 10 names of students and store them into an array of
          char nameOfStudents[10][50]. Sort the array and display them back.
          
          Hint: Use qsort() method.

*/



import java.util.Scanner;
import java.util.Arrays;

public class Q10_StudentSort 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] students = new String[10];

        System.out.println("Enter names of students(enter 'done' to stop): ");

        int count = 0;

        for(int i=0; i<students.length; i++)
        {
            String s = sc.next();

            if(s.equals("done"))
            {
                break;
            }

            students[i] = s;
            count++;
        }

        if(count == 0)
        {
            System.out.println("No Input");
        }

        else
        {

        System.out.print("Your Input: ");

        for(int i=0; i<count; i++)
        {
            System.out.print(students[i]+" ");
        }


        Arrays.sort(students,0,count);  //sorts only upto count-1

        System.out.print("\nSorted Array: ");

        for(int i=0; i<count; i++)
        {
            System.out.print(students[i]+" ");
        }

        }

        sc.close();

        
    }

    
}
