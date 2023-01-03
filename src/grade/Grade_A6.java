package grade;

import java.util.Scanner;

/* A school has following rules for grading system: a. Below 25 - F b. 25 to 45 - E c. 45 to 50 - D
d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
public class Grade_A6 {  //Declare class
    public static void main(String[] args) {   //main method or pre defined method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int a = sc.nextInt();   //read input from user

          //nested if else
         if(a<25)
         {
             System.out.println("The Grade is : " + "F");   // will print statement if condition is met
         }else if (a >= 25 && a < 45)
         {
             System.out.println("The Grade is : " + "E");  // will print statement if condition is met
         }else if(a >= 45 && a < 50)
         {
             System.out.println("The Grade is : " + "D");  // will print statement if condition is met
         }else if(a >= 50 && a < 60)
         {
             System.out.println("The Grade is : " + "C");  // will print statement if condition is met
         }else if(a >= 60 && a < 80)
         {
             System.out.println("The Grade is : " + "B"); // will print statement if condition is met
         }else if(a >=80)
         {
             System.out.println("The Grade is : " + "A");  // will print statement if condition is met
         }else {
             System.out.println("Fail");
         }


    }
}
