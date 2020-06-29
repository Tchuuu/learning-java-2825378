import java.security.AlgorithmConstraints;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);

        Triangle triangleA = new Triangle(15, 8, 3, 4, 7);
        Triangle triangleB = new Triangle(7, 4, 2, 1, 5);

        System.out.println(triangleA.findArea());
        System.out.println(Triangle.numOfSides);*/

        StudentProfile profileOne = new StudentProfile("Sally", "Salmon",2020, 3.75, "Film");
        StudentProfile profileTwo = new StudentProfile("Tiffen", "Taylor", 2021, 3.45, "Computer Sciences");

        System.out.println(profileTwo.expectedYearToGraduate);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);

    }
}
