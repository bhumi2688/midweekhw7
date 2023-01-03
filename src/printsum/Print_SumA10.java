package printsum;

// 10. Write a program to print the sum of two numbers entered by user by defining your own method

import java.util.Scanner;

public class Print_SumA10 {  //Class name

    public static void main(String[] args) {  //Main method or pre defined method
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First number : ");
        int num1 = sc.nextInt();  //read input from user

        System.out.println("Input Second number : ");
        int num2 = sc.nextInt();  //read input from user

        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum : " +sum);   //print statement


    }
}
