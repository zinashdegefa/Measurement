import java.util.Scanner;

public class GallonAndLiter {
public void gallonLiter() {

    Scanner input = new Scanner(System.in);

    String answer = "";
    while (!answer.equalsIgnoreCase("No")) {
        System.out.println("Choose 1 or 2 ?");

        System.out.println("1.gallon to liter\n2. liter to gallon");

        String check = input.next();

        if (check.equalsIgnoreCase("1")) {

            System.out.println("Enter the number in gallon: ");
            double numberInGallon = input.nextDouble();
            double liter = numberInGallon * 3.7854;
            System.out.println(numberInGallon + " gallon is " + liter + " liter.");

        } else if (check.equalsIgnoreCase("2")) {

            System.out.println("Enter the number in liter: ");
            double numberInLiter = input.nextDouble();
            double gallons = numberInLiter * 0.26;
            System.out.println(numberInLiter + " liter is " + gallons + " gallon.");

        }  else {

            System.out.println("Please enter a valid number (1 or 2)");

        }
        System.out.println("Do you want to continue in Gallon and Liter ?");
        answer = input.next();

    }
    System.out.println("See you!");

}


}
