package greatestamong;

//5. Take two int values from user and print greatest among them.

import java.util.Scanner;

public class Greatest_NumberA5 {  //Declare class

    public static void main(String[] args) {    //main method or pre defined method
        int number1;    //local variable
        int number2;    //local variable
        Scanner sc = new Scanner(System.in);    //scanner class
        System.out.println("Enter the First number : ");
        number1 = sc.nextInt();  //read input from user for first number

        System.out.println("Enter the Second number : ");
        number2 = sc.nextInt();  //read input from user for second number

        //nested if else statemnt
        if (number1 > number2) {
            System.out.println("Number1 is the greatest number :  ");
        } else if (number2 > number1) {
            System.out.println("Number2 is the greatest number : ");
        }else{
            System.out.println("Invalid");
        }
             }
}
