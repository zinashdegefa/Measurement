public class GallonAndLiter {
   static String fName;

   public GallonAndLiter(String firstName){
       fName = firstName;
   }
    public void convertToLiter(double gallons){

        double liters = gallons * 3.7854;
       System.out.println("Hello "+ fName + " " + gallons + " gallons is " + liters + " liters.");

    }

    public void convertToGallon(double liters) {
       double gallons = liters * 0.26;
        System.out.println("Hello " + fName + " " + liters + " liters is " + gallons + " gallons.");
    }


}
