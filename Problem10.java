import java.io.PrintWriter;
import java.io.FileWriter;
abstract class Furniture{
   private String material;
   private double weight;
   private String brand;

   public Furniture(String material,double weight,String brand)
   {
      this.material=material;
      this.weight=weight;
      this.brand=brand;
   }
   public void setMaterial(String material)
   {
      if(material==null)
      {
         throw new IllegalArgumentException("Material won't null");
      }
      this.material=material;
   }
   public String getMaterial()
   {
      return material;
   }
   public void setWeight(double weight)
   {
      if(weight<=0)
      {
         throw new IllegalArgumentException("Weight must be greater than 0");
      }
      this.weight=weight;
   }
   public double getWeight()
   {
      return weight;
   }
   public void setBrand(String brand)
   {
      if(brand==null)
      {
         throw new IllegalArgumentException("Brand won't null");
      }
      this.brand=brand;
   }
   public String getBrand()
   {
      return brand;
   }
  public abstract void assemble(PrintWriter writer);

}
class Chair extends Furniture{
   public Chair(String material,double weight,String brand)
   {
      super(material, weight, brand);
   }
   public void assemble(PrintWriter writer)
   {
      writer.println(getMaterial());
      writer.println(getWeight());
      writer.print(getBrand());

   }
}
class Table extends Furniture{
   public Table(String material,double weight,String brand)
   {
      super(material, weight, brand);
   }
   public void assemble(PrintWriter writer)
   {
      writer.println(getMaterial());
      writer.println(getWeight());
      writer.print(getBrand());

   }
}
public class Problem10 {
   public static void main(String[] args) {
      try(FileWriter fw =new FileWriter("furniture.txt",true);
      PrintWriter write=new PrintWriter(fw)
      ) {
         try {
            System.out.println("Chair Details:------------------------");
            Chair c=new Chair("Wood", 15.5, "RFL\n");
            c.assemble(write);
         } catch (Exception e) {
            System.out.println("--Error!");
         }
         try {
            System.out.println("Table Details:------------------------");
            Table t=new Table("Plastic", 18.5, "Bengle");
            t.assemble(write);
         } catch (Exception e) {
            System.out.println("--Error!");
         }
          
      } catch (Exception e) {
         System.out.println("Wrong File");
      }
   }
}
