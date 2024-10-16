interface Sportsname {
   String equipmentName = "Football";
   String brand = "Addidas";
   double weight = 5.5;

   default String getEquipment() {
      return equipmentName;
   }

   default String getBrand() {
      return brand;
   }

   default double getWeight() {
      return weight;
   }

   void use();
}

class Football implements Sportsname {
   String equipmentName = "Football";
   String brand = "Addidas";
   double weight = 5.5;

   public void use() {
      System.out.println("Equipment: " + getEquipment() + "Weight: " + getEquipment() + "Weight: " + getWeight());
   }

}

public class problem7 {
   public static void main(String[] args) {

   }
}
