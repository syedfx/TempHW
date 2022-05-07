package homework;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        do {
            System.out.print("----------------------------------Welcome------------------------------------------\n\n" +
                    "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----\n\n" +
                    "choose the conversion mode:\n\n" +
                    "1- Celsius-Fahrenheit\n\n" +
                    "2- Fahrenheit-Celsius\n\n" +
                    "Enter the temperature to convert:");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("\nEnter temperature in C: ");
                double tempInC = input.nextDouble();
                double tempInF = (tempInC * 9 / 5) + 32;
                System.out.println("\nTemperature in F is: " + tempInF);
            } else if (choice == 2) {
                System.out.print("\nEnter temperature in F: ");
                double tempInF = input.nextDouble();
                double tempInC = (tempInF - 32) * 5 / 9;
                System.out.println("\nTemperature in C is: " + tempInC);
            } else {
                System.out.println("\nInvalid Input Provided.");
                break;
            }

            System.out.print("\nDo you want to convert other temperatures ? Yes(Y) No(N) ");
            ch = input.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(ch) == 'Y');

    }
}
