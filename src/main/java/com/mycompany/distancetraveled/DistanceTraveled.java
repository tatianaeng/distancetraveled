/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distancetraveled;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class DistanceTraveled
{

    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner (System.in);
        
        // define our variables
        int speed;                      // speed while traveling (miles per hour)
        int time;                       // amount of time user was traveling
        int distance;                   // distance traveled
        
        // ask user for their speed while traveling
        System.out.println("Hi, Tatiana Eng! Please enter the speed at which you were traveling (in miles per hour).");
        
        // read user input
        speed = keyboard.nextInt();
        
        // use a while loop to validate user input (speed) -- cannot be a negative number
        while (speed < 0)
        {
            System.out.println("Error. Please enter a number greater than or equal to 0.");
            speed = keyboard.nextInt();         // read user input again
        }
        
        // ask user for their number of hours traveled
        System.out.println("Hi, Tatiana Eng! Please enter the amount of time you spent traveling (in hours).");
        
        // read user input
        time = keyboard.nextInt();
        
        // use a while loop to validate user input (time) -- number should not be less than 1
        while (time < 1)
        {    
            System.out.println("Error. Please enter a number greater than or equal to 1.");
            time = keyboard.nextInt();          // read user input again
        }
        
        // use a for loop to display the distance the vehicle traveled for each hour of the specified time period
        for (int count = 1; count <= time; count++)
        {   
            distance = speed * count;                                    // calculate distance
            System.out.println("During hour " + count + ", Tatiana Eng traveled " + distance + " miles.");
        }    
    }
}

/*

The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time

Write a program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours it has traveled.

It should use a loop to display the distance a vehicle has traveled for each hour of a time period specified by the user.

For example, if a vehicle is traveling at 40 mph for a 3-hour time period, it should display a report similar to the one that follows:

Hour        Distance Traveled
1           40
2           80
3           120

Input Validation:
Do not accept a negative number for speed and do not accept any value less than 1 for time traveled.

---

Using constructs from this chapter or earlier, complete Programming Challenges #2, Distance Traveled, on page 263.

Note the input validation needed (see section 4.3 for review).
Make sure your results are formatted properly.
You can choose to use standard input/output (Scanner) or JOptionPane dialog input/output.
Make sure you have comments in your program to explain what your program is doing.

In addition to your program running correctly, you will be graded on:
- use of comments. Your program needs to be properly commented.
- use of appropriate variable names.
- use of proper formatting of your output
- use of consistent input/output (using scanner or JOptionPane, not both)
- use of user prompts for input

When you are done, find the java source file in the project directory under the src directory, and attach it to this assignment (the .java file).

Also, attach a screenshot of the results of running your program. Your program should list your name somewhere in the results of your program.

*/