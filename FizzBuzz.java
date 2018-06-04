/*
 * Programmer: White, James
 * Chemeketa Community College
 * May 25, 2018
 * Project: FizzBuzz
 * File Name: FizzBuzz.java
 * 
 */

/**
 *
 * @author <a href= "mailto:jwhit185@my.chemeketa.edu" >James White</a>
 */

public class FizzBuzz
{
    public static void main(String[] args)
    {
        for (int x = 1; x <= 100; x++)
        {
            if (x % 3 == 0 && x % 5 == 0) // Check if it's divisible by both
            {
                System.out.println("FizzBuzz");
            }
            else if (x % 3 == 0) // Check if it's divisible by 3
            {
                System.out.println("Fizz");
            }
            else if (x % 5 == 0) // Check if its divisible by 5
            {
                System.out.println("Buzz");
            }
            else // Otherwise use the value of x
            {
                System.out.println(x);
            }
        }
    }
}