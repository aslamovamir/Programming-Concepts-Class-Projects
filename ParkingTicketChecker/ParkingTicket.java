import java.text.NumberFormat;

public class ParkingTicket
   {
      //a paramtetrized constructor is created to save data from the DriverProgram in the PoliceOfficer class
      public ParkingTicket(ParkingMeter meter, ParkedCar car, PoliceOfficer officer)
       {         
          NumberFormat nf = NumberFormat.getCurrencyInstance();
          int fine = 0;
          //it is assumed that minParked is greater than minPurchased
          //as the conditions applied in the PoliceOfficer class will ensure that it is the case
          //as it is the case, a $25.00 fine is applied first
          int add_illegal_hrs;
          double add_illegal_part_hr;
          int illegal_mins = meter.getMinParked() - meter.getMinPurchased();
          fine += 25;
        
          if ((illegal_mins - 60) > 0)
            {
               add_illegal_hrs = (illegal_mins - 60) / 60;
               fine += (add_illegal_hrs * 10);
               add_illegal_part_hr = (double)(illegal_mins - 60) / 60;
               if (add_illegal_part_hr > add_illegal_hrs)
                  {
                     fine += 10;
                  }
           }
           //print of the car info on the ticket
           car.printInfo();
           //print of the officer info on the ticket
           officer.printInfo();
           //print of the case info on the ticket
           System.out.println("CASE DATA:");
           System.out.println("Minutes illegally parked: " + (meter.getMinParked() - meter.getMinPurchased()));
           System.out.print("Fine: " + nf.format(fine));
       }
      //default constructor
      public ParkingTicket(){}
   }
