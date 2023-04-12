import java.util.Scanner;

public class ConvertTo {
    public void changeTo() {

        GallonAndLiter gallonObject = new GallonAndLiter();

        MilesAndKilometers mileObject = new MilesAndKilometers();

        CelsiusAndFahrenheit cFObject = new CelsiusAndFahrenheit();


        Scanner input = new Scanner(System.in);
        
       String answer = "";

            System.out.println("Enter your Name: ");
            String name = input.next();
            System.out.println("Hello " + name);

        while (!answer.equalsIgnoreCase("Exit")) {
            System.out.println("What do you want to convert?");
            System.out.println("1. celsius and fahrenheit");
            System.out.println("2. Gallon and Liter");
            System.out.println("3. Mile and kilometer");
            System.out.println("4. go back to measurement");

            answer = input.next();

            switch (answer) {
                case "1":
                    cFObject.celsiusAndFahrenheit();
                    break;
                case "2":
                    gallonObject.gallonLiter();
                    break;
                case "3":
                    mileObject.milesToKilometers();
                    break;
                case "4":
                    changeTo();
                    break;
                default:
                    System.out.println("Please enter a valid number (1, 2, 3)");


            }


        }
    }
}
