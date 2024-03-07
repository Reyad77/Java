import java.util.Scanner;

public class Classwork {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double radius;
    double area;

    System.out.print("Please input radius: ");
    radius = input.nextDouble();

    area = radius * radius * 3.14159;

    System.out.println("The area for the circle of radius " + radius + " is " + area);
}

}
