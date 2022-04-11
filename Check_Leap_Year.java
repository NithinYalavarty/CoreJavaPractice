/* Enter any year as an input. We first whether the given year is divisible by 400 or not. If it is divisible then it is a leap year else we check for further conditions. Now if it is divisible by 100 then it is not a leap year or else we further divide it by 4. If it is divisible then it is a leap year else its not. */


import java.util.Scanner;
public class Check_Leap_Year 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}
