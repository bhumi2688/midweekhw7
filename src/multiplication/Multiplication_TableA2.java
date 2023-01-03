package multiplication;

import java.util.Scanner;

// 2.Print multiplication table of 24, 50 and 29 using loop

public class Multiplication_TableA2 {   //Declare class

    public static void main(String[] args) {  //Main method or pre defined method

           int a = 24;   //Declare variable
        System.out.println("Timestable of 24 : " );
        for(int i = 1 ; i <=10 ; i++)     //for loop
        {
            System.out.println(a + " * " + i + " = " + a * i);   //print timetable
        }

        System.out.println("Timestable of 29 : " );
        int b = 29;
        for(int i = 1 ; i <= 10 ; i++)     //for loop
        {
            System.out.println(b + " * " + i + " = " + b * i);  //print timetable
        }

        System.out.println("Timestable of 50 : " );
        int c = 50;
        for(int i = 1 ; i <= 10 ; i++)       //for loop
        {
            System.out.println(c + " * " + i + " = " + c * i);      //print timetable
        }


    }

}
