abstract class MusicalInstrument{
   private String type;
   private String brand;
   private double price;
   public MusicalInstrument(String type,String brand,double price)
   {
    this.type=type;
    this.brand=brand;
    this.price=price;
   }
   public void setType(String type)
   {
      if(type==null || !type.equals("Guiter") || !type.equals("Piano") || !type.equals("Drums") )
      {
         throw new IllegalArgumentException("Wrong type");
      }
      this.type=type;
   }
   public String gettype()
   {
      return type;
   }
   public void setBrand(String brand)
   {
      if(brand==null )
      {
         throw new IllegalArgumentException("Null brand");
      }
      this.brand=brand;
   }
   public String getBrand()
   {
      return brand;
   }
   public void setPrice(double price)
   {
      if(price<=0 )
      {
         throw new IllegalArgumentException("Price won't be wrong");
      }
      this.price=price;
   }
   public double getPrice()
   {
      return price;
   }
    public abstract void play();

}
class Guiter extends MusicalInstrument{

   public Guiter(String type,String brand,double price)
   {
      super(type,brand,price);
   }
   public void play()
   {
      System.out.println("Playing the guiter\n"+"Brand: "+getBrand()+"\t"+"Type: "+gettype());
   }
}
class Piano extends MusicalInstrument{

   public Piano(String type,String brand,double price)
   {
      super(type,brand,price);
   }
   public void play()
   {
      System.out.println("Playing the piano\n"+"Brand: "+getBrand()+"\t"+"Type: "+gettype());
   }
}
class Drums extends MusicalInstrument{

   public Drums(String type,String brand,double price)
   {
      super(type,brand,price);
   }
   public void play()
   {
      System.out.println("Playing the drums\n"+"Brand: "+getBrand()+"\t"+"Type: "+gettype());
   }
}
public class problem5 {
   public static void main(String[] args) {
      
         
         try {
            Guiter g=new Guiter("Guiter", "ABC", 10000);
         g.play();
         } catch (IllegalArgumentException e) {
            System.out.println("--Error "+e.getMessage());
         
         }
      try {
         Piano p=new Piano("Piano", "ABC", 10000);
         p.play();

      } catch (IllegalArgumentException e) {
         System.out.println("--Error"+e.getMessage());
      }

      try {
         Drums d=new Drums("Drums", "ABC", 10000);
      
      
      d.play();
      } catch (IllegalArgumentException e) {
         System.out.println("--Error "+e.getMessage());
      }

   }
}
