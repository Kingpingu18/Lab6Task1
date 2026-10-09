import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Celsius;
        double Fahrenheit;

        System.out.println("Enter temperature in Celsius:");
        Celsius = input.nextDouble();

        if (Celsius < -273.15) {
            System.out.println("Error: Invalid temperature.");
        } else {
            Fahrenheit = (Celsius * 9.0 / 5.0) + 32;
            System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
        }

        input.close();
    }
}
