class Laptop {
   public static final String WINDOWS = "WINDOWS";
   public static final String MAC = "MAC";
   private String brand;
   private double PS;
   private String OS;

   public Laptop() {
      String brand = "Unknown";
      double PS = 2.5;
      String OS = "WINDOWS";
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getBrand() {
      return brand;
   }

   public void setPS(double PS) {
      this.PS = PS;
   }

   public double getPS() {
      return PS;
   }

   public void setOS(String OS) {
      this.OS = OS;
   }

   public String getOS() {
      return OS;
   }
   public String toString()
   {
      return brand+" "+PS+" "+OS;
   }

}

public class Problem2 {
   public static void main(String[] args) {
      Laptop l1=new Laptop();
      l1.setBrand("DELL");
      l1.setPS(3.5);
      l1.setOS("WINDOWS");
      System.out.println(l1.toString());

      Laptop l2=new Laptop();
      l2.setBrand("Apple");
      l2.setPS(2.8);
      l2.setOS("MAC");
      System.out.println(l2.toString());

   }
}
