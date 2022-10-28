//  Oryn Quinlan
//  G00406032
//  28/10/2022

package ie.atu;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        //first instance
        System.out.println("Please enter the first name: ");
        Scanner input = new Scanner(System.in);//creating a new scanner using the java.util
        String name = input.nextLine();//allows us to add values to the string name
        Student Getdetails = new Student(); //creating first instance of getDetails
        Getdetails.setName(name);//storing values ie name in the student class
        System.out.println("You entered: " + Getdetails.getName() + "\n");

        System.out.println("Please enter the first student email: ");
        String email = input.nextLine();
        Getdetails.setEmail(email);
        System.out.println("You entered: " + Getdetails.getEmail() + "\n");

        System.out.println("Please enter the first course name: ");
        String course = input.nextLine();
        Getdetails.setCourse(course);
        System.out.println("You entered: " + Getdetails.getCourse() + "\n\n");


        //second instance
        Student Getdetails2 = new Student();
        System.out.println("Please enter the second name: ");
        String name2 = input.nextLine();
        Getdetails2.setName(name2);
        System.out.println("You entered: " + Getdetails2.getName() + "\n");

        System.out.println("Please enter the second student email: ");
        String email2 = input.nextLine();
        Getdetails2.setEmail(email2);
        System.out.println("You entered: " + Getdetails2.getEmail() + "\n");

        System.out.println("Please enter the second course name: ");
        String course2 = input.nextLine();
        Getdetails2.setCourse(course2);
        System.out.println("You entered: " + Getdetails2.getCourse() + "\n\n");


        //Third instance using constructor
        Student Getdetails3 = new Student(name,course,email);
        System.out.println("Please enter the Third name: ");
        String name3 = input.nextLine();
        Getdetails3.setName(name3);
        System.out.println("You entered: " + Getdetails3.getName() + "\n");

        System.out.println("Please enter the third student email: ");
        String email3 = input.nextLine();
        Getdetails3.setEmail(email3);
        System.out.println("You entered: " + Getdetails3.getEmail() + "\n");

        System.out.println("Please enter the third course name: ");
        String course3 = input.nextLine();
        Getdetails3.setCourse(course3);
        System.out.println("You entered: " + Getdetails3.getCourse() + "\n\ng");

        //printing all details provided
        System.out.println("The three student names provided: " + name + "," + name2 + "," + name3+ "\n");
        System.out.println("The three student emails provided: " + email + "," + email2 + "," + email3+ "\n");
        System.out.println("The three student courses provided: " + course + "," + course2 + "," + course3 + "\n");
    }
}
