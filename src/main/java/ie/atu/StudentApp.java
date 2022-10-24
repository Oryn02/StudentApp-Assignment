package ie.atu;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        //first instance
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student StdName = new Student();
        System.out.println("You entered: " + name + "\n");
        StdName.setName(name);

        System.out.println("Please enter your student email: ");
        String email = input.nextLine();
        Student StdEmail = new Student();
        System.out.println("You entered: " + email + "\n");
        StdEmail.setName(email);

        System.out.println("Please enter your course name: ");
        String course = input.nextLine();
        Student StdCourse = new Student();
        System.out.println("You entered: " + course + "\n");
        StdCourse.setName(course);
    }
}
