/**
   The CellPhone class holds data about a cell phone.
*/

public class CellPhone {
   // Fields
   private String manufact;    // Manufacturer
   private String model;       // Model
   private double retailPrice; // Retail price
   private String color;
   private String provider;

   /**
    * Constructor
    *
    * @param man   The phone's manufacturer.
    * @param mod   The phone's model number.
    * @param price The phone's retail price.
    */

   public CellPhone(String man, String mod, double price, String colorPhone, String providerName) {
      manufact = man;
      model = mod;
      retailPrice = price;
      color = colorPhone;
      provider = providerName;
   }

   /**
    * The setManufact method sets the phone's
    * manufacturer name.
    *
    * @param man The phone's manufacturer.
    */

   public void setManufact(String man) {
      manufact = man;
   }

   /**
    * This method sets the color of the cellphone
    *
    * @param colorPhone
    */
   public void setColor(String colorPhone) {
     color = colorPhone;
   }

   /**
    * This method sets the color of the cellphone
    *
    * @param providerName
    */
   public void setProvider(String providerName) {
      provider = providerName;
   }

   /**
    * The setModel method sets the phone's
    * model number.
    *
    * @param mod The phone's model number.
    */

   public void setMod(String mod) {
      model = mod;
   }

   /**
    * The setRetailPrice method sets the phone's
    * retail price.
    *
    * @param price The phone's retail price.
    */

   public void setRetailPrice(double price) {
      retailPrice = price;
   }

   /**
    * getManufact method
    *
    * @return The name of the phone's manufacturer.
    */

   public String getManufact() {
      return manufact;
   }

   /**
    * getModel method
    *
    * @return The phone's model number.
    */

   public String getModel() {
      return model;
   }

   /**
    * getretailPrice method
    *
    * @return The phone's retail price.
    */

   public double getRetailPrice() {
      return retailPrice;
   }

   /**
    * This method gets the color of the cellphone
    *
    * @return color
    */
   public String getColor() {
      return color;
   }

   /**
    * This method gets the color of the cellphone
    *
    * @return provider
    */
   public String getProvider() {
      return provider;
   }



}