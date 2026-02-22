/*
       Q13. Declare an Array of type char* and initialize it with a few strings (hardcoded). 
            Display the strings which are duplicated in that array. 
            
            Hint: use strcmp()

*/

import java.util.Scanner;

public class Q13_StringDuplicate
{
     static void duplicate(String[] arr)
     {
          int hold = 0;

          System.out.println("Duplicate Strings are: ");

          for(int move = 1; move<arr.length; move++)
          {
               if(arr[hold].equals(arr[move]))
               {
                    System.out.println(arr[hold]);

                    hold++;
               }
          }
     }

     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);

          String[] arr = {"apple", "banana", "mango", "apple", "orange", "banana", "pineapple"};

          duplicate(arr);

          sc.close();
     }
}