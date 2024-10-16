import java.io.FileWriter;
import java.io.PrintWriter;

abstract class Vehicle{
   private String make;
   private String model;
   private int year;
   private String fueltype;
   
   public Vehicle(String make,String model,int year,String fueltype)
   {
      this.make=make;
      this.model=model;
      this.year=year;
      this.fueltype=fueltype;
   }
   public void setmake(String make)
   {
      this.make=make;
   }
   public String getMake()
   {
      return make;
   }
   //
   public void setModel(String model)
   {
      this.model=model;
   }
   public String getModel()
   {
      return model;
   }
   public void setYear(int year)
   {
      this.year=year;
   }
   public int getYear()
   {
      return year;
   }
   public void setFuelType(String fuelType)
   {
      this.fueltype=fuelType;
   }
   public String getFuelType()
   {
      return fueltype;
   }
   public abstract void refuel(PrintWriter write);
}

class ElectricCar extends Vehicle{
   public ElectricCar(String make,String model,int year,String fueltype)
   {
     super(make, model, year, fueltype);
   }
   public void refuel(PrintWriter write)
   {
    write.println("Charging the electric car: ");
    write.println(getMake());
    write.println(getModel());
    write.println(getYear());
    write.println(getFuelType());
   }
}
class GasolineTruck extends Vehicle{
   public GasolineTruck(String make,String model,int year,String fueltype)
   {
     super(make, model, year, fueltype);
   }
   public void refuel(PrintWriter write)
   {
    write.println("Charging the electric car: ");
    write.println(getMake());
    write.println(getModel());
    write.println(getYear());
    write.println(getFuelType());
   }
}
class HybridMotorcycle extends Vehicle{
   public HybridMotorcycle(String make,String model,int year,String fueltype)
   {
     super(make, model, year, fueltype);
   }
   public void refuel(PrintWriter write)
   {
    write.println("Charging the electric car: ");
    write.println(getMake());
    write.println(getModel());
    write.println(getYear());
    write.println(getFuelType());
   }
}

public class problem8 {
   public static void main(String[] args) {
          
      try(FileWriter fw=new FileWriter("motor.txt",true);
      PrintWriter write=new PrintWriter(fw)){
         try {
            ElectricCar e=new ElectricCar("ABC", "XYZ", 2022, "OIL");
            e.refuel(write);
         } catch (IllegalArgumentException e) {
            System.out.println("--Error!"+e.getMessage());
            
         }
         try {
            GasolineTruck g=new GasolineTruck("ABC", "XYZ", 2022, "OIL");
            g.refuel(write);
         } catch (IllegalArgumentException e) {
            System.out.println("--Error!"+e.getMessage());
            
         }
         try {
            HybridMotorcycle h=new HybridMotorcycle("ABC", "XYZ", 2022, "OIL");
            h.refuel(write);
         } catch (IllegalArgumentException e) {
            System.out.println("--Error!"+e.getMessage());
            
         }
      } catch (Exception e) {
         
         System.out.println("--Error!"+e.getMessage());
      }
   }

   
}
