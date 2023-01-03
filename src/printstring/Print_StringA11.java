package printstring;

import java.util.Scanner;

// 11. Write a program to print a string entered by user.
public class Print_StringA11 {  //Declare class

    public static void main(String[] args) {  //Main method
        Scanner sc = new Scanner(System.in);  // scanner class
        System.out.println("Enter any word : ");
        String word = sc.next();  //read input user
        System.out.println("My word is : " + word);  //print statement

    }
}
