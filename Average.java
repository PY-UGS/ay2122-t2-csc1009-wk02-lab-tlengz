import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();

        int count = 3;

        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is "+ String.format("%.2f", average(num1, num2, num3, count)));

        input.close();
    }
    public static double average(double x, double y, double z, int n)
    {
        return (x + y + z)/n;
    }
}
