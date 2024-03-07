import java.util.Scanner;
public class Readnumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input radius");
        double radius = input.nextDouble ();

        System.out.println("age:");
        int age = input.nextInt();

        System.out.println("distance:");
        long distance = input.nextLong();

        System.out.println("radius: " + radius + ", age: " + age + ",distance: " + distance);
    }
}
