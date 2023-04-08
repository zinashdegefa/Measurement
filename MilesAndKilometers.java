import java.util.Scanner;

public class MilesAndKilometers {
    Scanner scan = new Scanner(System.in);
   // Scanner input = new Scanner(System.in);
   // public  MilesAndKilometers(String name, String mileToKm, int myNu) {

    //}


//    public void milesToKilometers() {
//
//        System.out.println("Please enter Miles = ");
//      double mile = scan.nextDouble();
//      double kilometer = mile *   1.60934;
//      System.out.println(mile + " Miles is " + kilometer + " Km.");
//    }
//
//    public void KilometersToMiles() {
//
//        System.out.println("Please enter Km = ");
//        double kilometer = scan.nextDouble();
//        double mile = kilometer * 0.621;
//        System.out.println(kilometer + " Km is " + mile + " Miles." );
//
//    }

   public void milesToKilometers() {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter your Name:  ");
       String name = input.next();

      System.out.println("Hello " + name +"! you are here to change Mile to Km or Km to Mile. "   );

       double number = 1;
//       double Yes = 1;
//       double No = 2;
       while (number != 0) {
           System.out.println("What do you want to change ?");

           System.out.println("1. mile to km \n2. km to mile");

           String mileToKm = input.next();

           System.out.println("Enter the number: ");
           number = scan.nextDouble();

           if (mileToKm.equalsIgnoreCase("1")) {
               double kilometer = number * 1.60934;
               System.out.println(number + " Miles is " + kilometer + " Km.");

           } else if (mileToKm.equalsIgnoreCase("2")) {
               double mile = number * 0.621;
               System.out.println(number + " Km is " + mile + " Miles.");

           }  else {
               System.out.println("Please enter a valid number (1 or 2)");
           }
           System.out.println("Do you want to continue?");
           String answer = input.next();

           if (answer.equalsIgnoreCase("NO")) {
              // scan.close();
               break;
           }
       }


     System.out.print("Thank you! ");

   }


}

