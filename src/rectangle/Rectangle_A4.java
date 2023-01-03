package rectangle;

// 4.Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class Rectangle_A4 {   //Declare class

    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);    //scanner class
        System.out.println("Enter value of Length : ");
        double length = sc.nextDouble();  //read input from user

        System.out.println("Enter value of breadth : ");
        double breadth = sc.nextDouble();  //read input from user

           //if else statement
        if(length==breadth)    //used ==operator
        {
            System.out.println(" It is Square ");
        }else {
            System.out.println(" It is not Square ");
        }
    }
}
