abstract class Vehicle {
   private String make;
   private String model;
   private int year;

   public Vehicle(String make, String model, int year) {
      this.make = make;
      this.model = model;
      this.year = year;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public String getMake() {
      return make;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getModel() {
      return model;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getYear() {
      return year;
   }

   public abstract void drive();

}

class Car extends Vehicle {
   public Car(String make, String model, int year) {
      super(make, model, year);
   }

   public void drive() {
      System.out.println("Make: " + getMake() + " Model " + getModel() + " Year " + getYear());
   }
}

class Truck extends Vehicle {
   public Truck(String make, String model, int year) {
      super(make, model, year);
   }

   public void drive() {
      System.out.println("Make: " + getMake() + " Model " + getModel() + " Year " + getYear());
   }
}

class Motocycle extends Vehicle {
   public Motocycle(String make, String model, int year) {
      super(make, model, year);
   }

   public void drive() {
      System.out.println("Make: " + getMake() + " Model " + getModel() + " Year " + getYear());
   }
}

public class Problem3 {
   public static void main(String[] args) {
      Car c = new Car("Germany", "BMW11", 2023);
      c.drive();
      Truck t = new Truck("Japan", "Toyota", 2020);
      t.drive();
      Motocycle m = new Motocycle("Bangladesh", "Walton", 2021);
      m.drive();
   }
}
