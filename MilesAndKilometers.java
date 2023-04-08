import java.util.Scanner;

public class MilesAndKilometers {

   public void milesToKilometers() {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter your Name:  ");
       String name = input.next();

      System.out.println("Hello " + name +"! you are here to change Mile to Km or Km to Mile. "   );

         String answer = "";
       while (!answer.equalsIgnoreCase("No")) {
           System.out.println("What do you want to change ?");

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
           System.out.println("Do you want to continue?");
            answer = input.next();

       }
       System.out.print("Thank you! ");

   }

}

