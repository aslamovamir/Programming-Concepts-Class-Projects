public class ParkedCar
   {
      private String make_car;
      private String model_car;
      private String color_car;
      private String license_num_car;
      
      public ParkedCar()
         {
            make_car = "Null";
            model_car = "Null";
            color_car = "Null";
            license_num_car = "Null";
         }
      public ParkedCar(String make, String model, String color, String license)
         {
            this.make_car = make;
            this.model_car = model;
            this.color_car = color;
            this.license_num_car = license;
         }
      
      public void setMake(String make)
         {
            this.make_car = make;
         }
      public void setModel(String model)
         {
            this.model_car = model;
         }
      public void setColor(String color)
         {
            this.color_car = color;
         }
      public void setLicense(String license)
         {
            this.license_num_car = license;
         }
         
      public String getMake()
         {
            return make_car;
         }
         public String getModel()
         {
            return model_car;
         }
         public String getColor()
         {
            return color_car;
         }
         public String getLicense()
         {
            return license_num_car;
         }
       
       public void printInfo()
         {
            System.out.printf("%5s", "CAR DATA:\n");
            System.out.println("Make: " + make_car + "\nModel: " + model_car + "\nColor: " + 
                                color_car + "\nLicense Number: " + license_num_car + "\n");
         }  
   }
