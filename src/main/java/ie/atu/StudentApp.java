package ie.atu;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("You entered: " + name);

        System.out.println("Please enter your student email: ");
        String email = input.nextLine();
        System.out.println("You entered: " + email);

        System.out.println("Please enter your course name: ");
        String course = input.nextLine();
        System.out.println("You entered: " + course);
    }
}
