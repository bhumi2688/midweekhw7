package age;

// 7.Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class Age_A7 {  //Declare class
    public static void main(String[] args) {    //Main method or pre defined method

        Scanner sc = new Scanner(System.in);
        System.out.println("Age of First Person : ");
        int age1 = sc.nextInt(); //read for user input

        System.out.println("Age of Second Person : ");
        int age2 = sc.nextInt(); //read from user input

        System.out.println("Age of Third Person : ");
        int age3 = sc.nextInt(); //read from user input

        //used nested if else for the youngest
        if(age1<age2 && age1<age3)
        {
            System.out.println("First person is the Youngest " );
        }else if (age2<age1 && age2<age3)
        {
            System.out.println("Second person is the Youngest ");
        }else if(age3<age1 && age3<age2)
        {
            System.out.println("Third person is the Youngest ");
        }else {
            System.out.println("Same Age");
        }
          //used nested if else for the oldest
        if(age1>age2 && age1>age3)
        {
            System.out.println("First person is the Oldest " );
        }else if (age2>age1 && age2>age3)
        {
            System.out.println("Second person is the Oldest ");
        }else if(age3>age1 && age3>age2)
        {
            System.out.println("Third person is the Oldest ");
        }else {
            System.out.println("Same Age");
        }



    }
}