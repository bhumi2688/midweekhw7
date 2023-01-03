package medical;

/* 9. Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print according
 */


import java.util.Scanner;

public class MedicalCondition_A9 {   //Declare class name

    public static void main(String[] args) {  //Main method or pre defined method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of classes held");
        double a = sc.nextDouble();    //read from user input
        System.out.println("Enter number of classes attended");
        double b = sc.nextDouble();    //read from user input
        double c = (b/a * 100);     //percentage

        //used if else
        if(c<75)
        {
            System.out.println("Student is allowed to sit in the exam if he or she has medical cause");
            char d = sc.next().charAt(0);    //read from user input yes or no
            if(d=='Y')     //nested if else
            {
                System.out.println("You can sit in the exam");
            }else
            {
                System.out.println("You cannot sit in the exam");
            }
        }else
        {
            System.out.println("Student is allowed to sit in the exam");
        }

    }
}
