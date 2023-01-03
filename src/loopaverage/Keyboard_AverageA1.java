package loopaverage;

//1. Take 10 integers from keyboard using loop and print their average value on the screen

import java.util.Scanner;

public class Keyboard_AverageA1 {     //Declare class

    public static void main(String[] args) {   //Main method or pre defined method
        Scanner sc = new Scanner(System.in);    //scanner class
        int sum = 0;

        for(int i = 0 ; i <10 ; i++)    //for loop method
        {
            System.out.println("Enter number : ");
            sum = sum + sc.nextInt();      //reads input from user
        }
        double average = sum/10;         //avg formula
        System.out.println("Average is :" + average);   //will print statement
    }

}
