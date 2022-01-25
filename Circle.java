import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        Double radius = input.nextDouble();

        Double area = PI * radius * radius;        
        System.out.println("The area for the circle of radius " + radius + " is "+ String.format("%.7f", area));
        
        input.close();
        
      }
}
