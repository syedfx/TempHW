package otherway;
import java.util.Scanner;

public class ConverterWithInterface implements TemperatureConverter {


    public static void main(String[] args) {
        ConverterWithInterface con = new ConverterWithInterface();

        Scanner input = new Scanner(System.in);
        char ch;

        do {
            System.out.print("----------------------------------Welcome------------------------------------------\n\n" +
                    "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----\n\n" +
                    "choose the conversion mode:\n\n" +
                    "1- Celsius-Fahrenheit\n\n" +
                    "2- Fahrenheit-Celsius\n\n" +
                    "Choose only one of the two options :");

            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("\nEnter temperature in C: ");
                double tempInC = input.nextDouble();
                System.out.println("\nTemperature in F is: " + con.convertCelsiusToFahrenheit(tempInC));
            } else if (choice == 2) {
                System.out.print("\nEnter temperature in F: ");
                double tempInF = input.nextDouble();
                System.out.println("\nTemperature in C is: " + con.convertFahrenheitToCelsius(tempInF));
            } else {
                System.out.println("\nInvalid Input Provided.");
            }

            System.out.print("\nDo you want to convert other temperatures ? Yes(Y) No(N) ");
            ch = input.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(ch) == 'Y');

    }

    @Override
    public double convertFahrenheitToCelsius(double tempInF) {
        return (tempInF - 32) * 5 / 9;
    }

    @Override
    public double convertCelsiusToFahrenheit(double tempInC) {
        return (tempInC * 9 / 5) + 32;

    }
}