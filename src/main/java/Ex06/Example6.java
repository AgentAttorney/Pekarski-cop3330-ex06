package Ex06;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example6 {
    public static void main(String[] args)
    {
        System.out.print("What is your current age? ");
        Scanner input = new Scanner(System.in);
        String str_age1 = input.next();

        System.out.print("At what age would you like to retire? ");
        String str_age2 = input.next();

        int age_1 = Integer.parseInt(str_age1);
        int age_2 = Integer.parseInt(str_age2);

        int years_left = age_2 - age_1;
        System.out.println("You have " + years_left + " years left until you can retire.");

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");

        String str_CurYear = format.format(date);
        int cur_year = Integer.parseInt(str_CurYear);

         System.out.print("It's " + cur_year + ", so you can retire in " + (cur_year + years_left) + ".");
    }
}
