package ie.atu;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        //first instance
        System.out.println("Please enter the first name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student Getdetails = new Student();
        Getdetails.setName(name);
        System.out.println("You entered: " + Getdetails.getName() + "\n");

        System.out.println("Please enter the first student email: ");
        String email = input.nextLine();
        Getdetails.setEmail(email);
        System.out.println("You entered: " + Getdetails.getEmail() + "\n");

        System.out.println("Please enter the first course name: ");
        String course = input.nextLine();
        Getdetails.setCourse(course);
        System.out.println("You entered: " + Getdetails.getCourse() + "\n");


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
        System.out.println("You entered: " + Getdetails2.getCourse() + "\n");

    }
}
