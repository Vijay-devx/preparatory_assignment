// Q1. Write a progrm to input n numbes on command line argument and calculate maximum of them.

import java.util.Scanner;
import java.util.Arrays;

public class Q1_Max
{
    static int calculateMax(int[] arr, int n)
    {
        int max = arr[0];

        for(int i=0; i<n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        return max;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter the elements of array: ");

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("You have entered: "+Arrays.toString(arr));

        System.out.println("Max = "+calculateMax(arr,n));

        sc.close();

    }
}