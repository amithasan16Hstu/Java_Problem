import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

abstract class SmartDevice {
   private String deviceName;
   private String brand;
   private int connectivity;

   public SmartDevice(String deviceName, String brand, int connectivity) {
      this.deviceName = deviceName;
      this.brand = brand;
      this.connectivity = connectivity;
   }

   public void setDevicename(String deviceName) {
      if (deviceName == null) {
         throw new IllegalArgumentException("Wrong DeviceName");
      }
      this.deviceName = deviceName;
   }

   public String getDeviceName() {
      return deviceName;
   }

   public void setBrand(String brand) {
      if (brand == null) {
         throw new IllegalArgumentException("Wrong Brand");
      }
      this.brand = brand;
   }

   public String getBrand() {
      return brand;
   }

   public void setConnectivity(int connectivity) {
      if (connectivity <= 0) {
         throw new IllegalArgumentException("Connectivity must be greater than zero");
      }
      this.connectivity = connectivity;
   }

   public int getConnectivity() {
      return connectivity;
   }

   // Abstract method
   public abstract void operate(PrintWriter writer);
}

class Smartlight extends SmartDevice {
   public Smartlight(String deviceName, String brand, int connectivity) {
      super(deviceName, brand, connectivity);
   }

   public void operate(PrintWriter writer) {
      writer.println("Turning on the smart light: ");
      writer.println("Device Name: " + getDeviceName());
      writer.println("Brand Name: " + getBrand());
      writer.println("Connectivity: " + getConnectivity());
      writer.println("------------------------------------------");
   }
}

class SmartThermostat extends SmartDevice {
   public SmartThermostat(String deviceName, String brand, int connectivity) {
      super(deviceName, brand, connectivity);
   }

   public void operate(PrintWriter writer) {
      writer.println("Turning on the smart thermostat: ");
      writer.println("Device Name: " + getDeviceName());
      writer.println("Brand Name: " + getBrand());
      writer.println("Connectivity: " + getConnectivity());
      writer.println("--------------------------------------------------");
   }
}

class SmartLock extends SmartDevice {
   public SmartLock(String deviceName, String brand, int connectivity) {
      super(deviceName, brand, connectivity);
   }

   public void operate(PrintWriter writer) {
      writer.println("Turning on the smart lock: ");
      writer.println("Device Name: " + getDeviceName());
      writer.println("Brand Name: " + getBrand());
      writer.println("Connectivity: " + getConnectivity());
      writer.println("------------------------------------------------------");
   }
}

public class problem6 {
   public static void main(String[] args) {
      // FileWriter setup inside try-with-resources to automatically close the writer
      try (FileWriter fw = new FileWriter("smart_device_log.txt", true); // 'true' for appending data
           PrintWriter writer = new PrintWriter(fw)) {
           
         try {
            Smartlight light = new Smartlight("Energy", "LED", 80);
            light.operate(writer);  // Writing to file
         } catch (IllegalArgumentException e) {
            writer.println("--Error! " + e.getMessage());
         }

         try {
            SmartThermostat thermostat = new SmartThermostat("CoolTherm", "Nest", 60);
            thermostat.operate(writer);  // Writing to file
         } catch (IllegalArgumentException e) {
            writer.println("--Error! " + e.getMessage());
         }

         try {
            SmartLock lock = new SmartLock("SecuriLock", "Yale", 50);
            lock.operate(writer);  // Writing to file
         } catch (IllegalArgumentException e) {
            writer.println("--Error! " + e.getMessage());
         }

      } catch (IOException e) {
         System.out.println("An error occurred while writing to the file: " + e.getMessage());
      }
   }
}
