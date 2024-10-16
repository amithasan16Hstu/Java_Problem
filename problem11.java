import java.util.Scanner;

class Watch {
   public static final String Analog = "ANALOG";
   public static final String Digital = "DIGITAL";

   private String brand;
   private double price;
   private String type;

   public Watch() {
      String brand = "Unknown";
      double price = 50.0;
      String type = "ANALOG";
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getBrand() {
      return brand;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getPrice() {
      return price;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return type;
   }
   public String toString()
   {
      return "Brand: \t"+brand +" "+"Price: \t"+price+" "+"Type: \t"+type+"\n";
   }

}

public class problem11 {
   public static void main(String[] args) {
      Watch watch=new Watch();
      watch.setBrand("Rolex");
      watch.setPrice(10000.0);
      watch.setType("ANALOG");
      System.out.println(watch.toString());

      Watch w1=new Watch();
      w1.setBrand("Casio");
      w1.setPrice(150.0);
      w1.setType("DIGITAL");
      System.out.println(w1.toString());
      


   }

}