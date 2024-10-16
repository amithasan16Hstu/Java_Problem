import java.io.PrintWriter;
import java.io.FileWriter;

abstract class HouseholdElectronics {
   private String brand;
   private String wattage;
   private double price;

   public HouseholdElectronics(String brand, String wattage, double price) {
      this.brand = brand;
      this.wattage = wattage;
      this.price = price;
   }

   public void setBrand(String brand) {
      if(brand==null)
      {
         throw new IllegalArgumentException("Wrong Brand");
      }
      this.brand = brand;
   }

   public String getBrand() {
      return brand;
   }

   public void setWattage(String wattage) {
      this.wattage = wattage;
   }

   public String getWattage() {
      return wattage;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getPrice() {
      return price;
   }

   public abstract void use1(PrintWriter write);

}

class VacuumCleaner extends HouseholdElectronics {
   public VacuumCleaner(String brand, String wattage, double price) {
      super(brand, wattage, price);
   }

   public void use1(PrintWriter write) {
      write.println("Using the vacuum cleaner:");
      write.println("Brand: " + getBrand());
      write.println("Wattage: " + getWattage());
   }
}

class AirConditionar extends HouseholdElectronics {
   public AirConditionar(String brand, String wattage, double price) {
      super(brand, wattage, price);
   }

   public void use1(PrintWriter write) {
      write.println("Using the vacuum cleaner:");
      write.println("Brand: " + getBrand());
      write.println("Wattage: " + getWattage());
   }
}

public class problem9 {
   public static void main(String[] args) {
      try(FileWriter fw=new FileWriter("electronics.txt",true);
      PrintWriter write=new PrintWriter(fw)) {
         try {
            VacuumCleaner vc=new VacuumCleaner("SONY", "ABC", 1000000);
            vc.use1(write);
         } catch (IllegalArgumentException e) {
            System.out.println("--Error!");
         }
         
         try {
            AirConditionar ac=new AirConditionar("LG", "ABC", 2000000);
            ac.use1(write);
         } catch (IllegalArgumentException e) {
            System.out.println("--Error!");
         }

         
      } catch (Exception e) {
         System.out.println("--Error"+"Wrong File");
      }
      }
}
