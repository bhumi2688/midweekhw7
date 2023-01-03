package attendance;
/* 8.A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user Number of classes held Number of classes attended.
And print percentage of class attended Is student is allowed to sit in exam or not.
 */

import java.util.Scanner;

public class Attendance_A8 {     //Declare class name
    public static void main(String[] args) {   //main method or pre defined method
        double classheld;      //variable in double
        double classattend;
        double percentattend;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes held : ");
        classheld = sc.nextDouble();   //read input from user
        System.out.println("Enter the number of classes attended : ");
        classattend = sc.nextDouble();   //read input from user
        percentattend = (classattend * 100)/classheld;
             //if else statement
        if(percentattend<75)
        {
            System.out.println("Student is not allowed to sit in the exam");  //see if condition is met or not
        }else {
            System.out.println("Student is allowed to sit in the exam");
        }
    }
}