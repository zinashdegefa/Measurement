import java.util.Scanner;

public class MilesAndKilometers {


    Scanner scan = new Scanner(System.in);
    public void milesToKilometers() {

        System.out.println("Please enter Miles = ");
      double mile = scan.nextDouble();
      double kilometer = mile *   1.60934;
      System.out.println(mile + " Miles is " + kilometer + " Km.");
    }

    public void KilometersToMiles() {

        System.out.println("Please enter Km = ");
        double kilometer = scan.nextDouble();
        double mile = kilometer * 0.621;
        System.out.println(kilometer + " Km is " + mile + " Miles." );

    }

}
