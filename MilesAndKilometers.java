import java.util.Scanner;

public class MilesAndKilometers {

   public void milesToKilometers() {

      Scanner input = new Scanner(System.in);

         String answer = "";
       while (!answer.equalsIgnoreCase("No")) {
           System.out.println("Choose 1 or 2 ?");

           System.out.println("1. mile to km \n2. km to mile");

           String check = input.next();

           if (check.equalsIgnoreCase("1")) {

               System.out.println("Enter the number in mile: ");
               double numberInMile = input.nextDouble();
               double kilometer = numberInMile * 1.60934;
               System.out.println(numberInMile + " Miles is " + kilometer + " Km.");

           } else if (check.equalsIgnoreCase("2")) {

               System.out.println("Enter the number in km: ");
               double numberInKm = input.nextDouble();
               double mile = numberInKm * 0.621;
               System.out.println(numberInKm + " Km is " + mile + " Miles.");

           }  else {

               System.out.println("Please enter a valid number (1 or 2)");

           }
           System.out.println("Do you want to continue in Miles and Kilometers ?");
            answer = input.next();

       }
       System.out.println("See you!");
       System.out.println("TO go back to measurement\npress Number 4.");
       answer = input.next();
       if (answer.equalsIgnoreCase("4"))  { switch (answer) {
           case "4":
               break;
       }

       }

   }

}

