import java.util.Scanner;

public class CelsiusAndFahrenheit {
    public void celsiusAndFahrenheit() {
        Scanner input = new Scanner(System.in);




        String answer = "";
       while (!answer.equalsIgnoreCase("No")) {
           System.out.println("Choose 1 or 2 ?");
           System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius");
           String check = input.next();

           if (check.equalsIgnoreCase("1")) {
               System.out.println("Please enter the Number in Celsius: ");
               double numberInCelsius = input.nextDouble();
               double fahrenheit = (9.0 / 5.0) * numberInCelsius + 32;
               System.out.println(numberInCelsius + " Celsius is " + fahrenheit + " Fahrenheit.");
           } else if (check.equalsIgnoreCase("2")) {
               System.out.println("Please enter the Number in Fahrenheit: ");
               double numberInFahrenheit = input.nextDouble();
               double celsius = (5.0 / 9.0) * (numberInFahrenheit - 32);
               System.out.println(numberInFahrenheit + " Fahrenheit is " + celsius + " Celsius.");

           } else {
               System.out.println("Please enter a valid number (1 or 2)");
           }

           System.out.println("Do you want to continue in Celsius and Fahrenheit?");
           answer = input.next();


       }

      System.out.println("See you!");

    }

}
