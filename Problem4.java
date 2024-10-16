abstract class Device {
   private String brand;
   private String model;
   private double price;

   public Device(String brand, String model, double price) {
      this.brand = brand;
      this.model = model;
      this.price = price;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getBrand() {
      return brand;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getModel() {
      return model;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getPrice() {
      return price;
   }

   public abstract void start();
}

class Laptop extends Device {
   public Laptop(String brand, String model, double price) {
      super(brand, model, price);
   }

   public void start() {
      System.out.println("Brand : " + getBrand() + " Model: " + getModel() + " Price: " + getPrice());
   }
}

class Smartphone extends Device {
   public Smartphone(String brand, String model, double price) {
      super(brand, model, price);
   }

   public void start() {
      System.out.println("Brand : " + getBrand() + " Model: " + getModel() + " Price: " + getPrice());
   }
}

class Tablet extends Device {
   public Tablet(String brand, String model, double price) {
      super(brand, model, price);
   }

   public void start() {
      System.out.println("Brand : " + getBrand() + " Model: " + getModel() + " Price: " + getPrice());
   }
}

public class Problem4 {
   public static void main(String[] args) {
      Laptop laptop = new Laptop("HP", "yyygbnn", 59000.20);
      laptop.start();
      Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 700000);
      smartphone.start();
      Tablet tablet = new Tablet("MAC", "Apple", 210000);
      tablet.start();
   }
}
