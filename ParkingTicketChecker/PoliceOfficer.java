public class PoliceOfficer
   {
       private String officer_name = "Steve Rodger";
       private int officer_badge_num = 7835;
   
      public void printInfo()
        {
          System.out.printf("%5s", "OFFICER DATA:\n");
          System.out.println("Name: " + officer_name + "\nBadge number: " + officer_badge_num + "\n");
        }
   
       //default constructor
       public PoliceOfficer(){}
       //constructor built to get a link to collected data from ParkingMeter object in the driver
       //meter inspection of an incident car, inspection constructor
       public PoliceOfficer(ParkingMeter meter){}
       //use of a boolean to take a corresponding action for the driver
       boolean case_to_open;
       public void check(ParkingMeter meter)
          {
             if (meter.getMinParked() <= meter.getMinPurchased())
                {
                   System.out.println("Clear with the car.");
                   case_to_open = false;
                }
             else if (meter.getMinParked() > meter.getMinPurchased()) 
                {
                   System.out.println("A case opened, a parking ticket to be issued.");
                   case_to_open = true;
                }
           }
       //boolean-defined action to take for the driver
       public boolean Case()
           {
              return this.case_to_open;
           }
       //if the value of the boolean case_to_open is true, PoliceOfficer class proceeds to creat a ParkingTicket object
       //otherwise the driver program avoids collection of any data on the car, and terminates
       //this task is built in a method
       public PoliceOfficer(ParkingMeter meter, ParkedCar car, PoliceOfficer officer)
          {
            ParkingTicket ticket = new ParkingTicket(meter, car, officer);
          }
   }
