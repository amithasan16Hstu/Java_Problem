class MobilePhone {
   public static final String IOS = "IOS";
   public static final String ANDROID = "ANDROID";
   private String brand;
   private double screenSize;
   private String OS;

   // Constructor with default values
   public MobilePhone() {
      brand = "Unknown";
      screenSize = 5.0;
      OS = "IOS";
   }

   // Set the brand with basic validation
   public void setBrand(String bran) {
      if (bran == null || bran.isEmpty()) {
         throw new IllegalArgumentException("Brand cannot be null or empty.");
      }
      brand = bran;
   }

   // Get brand
   public String getBrand() {
      return brand;
   }

   // Set screen size with validation
   public void setScreen(double size) {
      if (size <= 0) {
         throw new IllegalArgumentException("Screen size must be greater than zero.");
      }
      screenSize = size;
   }

   // Get screen size
   public double getScreen() {
      return screenSize;
   }

   // Set OS with basic validation
   public void setOS(String os) {
      if (os == null || (!os.equals(IOS) && !os.equals(ANDROID))) {
         throw new IllegalArgumentException("Operating system must be IOS or ANDROID.");
      }
      OS = os;
   }

   // Get OS
   public String getOS() {
      return OS;
   }

   // Override toString method
   @Override
   public String toString() {
      return "Brand: " + brand + ", Screen Size: " + screenSize + ", Operating System: " + OS;
   }
}

public class Problem1 {
   public static void main(String[] args) {
      // Exception handling for MobilePhone objects
      try {
         MobilePhone m1 = new MobilePhone();
         m1.setBrand("iPhone");
         m1.setScreen(6.0);
         m1.setOS(MobilePhone.IOS);
         System.out.println(m1.toString());
      } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
      }

      try {
         MobilePhone m2 = new MobilePhone();
         m2.setBrand("Samsung");
         m2.setScreen(5.5);
         m2.setOS(MobilePhone.ANDROID);
         System.out.println(m2.toString());
      } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
      }

      // Example of an error case (invalid screen size)
      try {
         MobilePhone m3 = new MobilePhone();
         m3.setBrand("Nokia");
         m3.setScreen(-4.0); // Invalid screen size
         m3.setOS("ANDROID");
         System.out.println(m3.toString());
      } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
}
