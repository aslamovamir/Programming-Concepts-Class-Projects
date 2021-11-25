import java.util.Scanner;
public class DriverProgram
   {
      public static void main(String [] args)
         {
            Scanner scan = new Scanner(System.in);
            int mins_parked;
            int mins_paid_for;
            
            //monitor of an incident car takes place
            ParkedCar car = new ParkedCar();
            System.out.print("Number of minutes paid for in meter: ");
            mins_paid_for = scan.nextInt();
            System.out.print("Number of minutes car has been parked: ");
            mins_parked = scan.nextInt();
            //parking meter registers the minutes
            ParkingMeter meter = new ParkingMeter(mins_paid_for, mins_parked);
            //police officer monitors parking meter
            PoliceOfficer officer = new PoliceOfficer(meter);
            officer.check(meter);
            //police officer object returns a boolean value telling the driver if a case needs be opened
            boolean case_to_consider;
            case_to_consider = officer.Case();
            //if the value turns out to be true, the driver proceeds to collect data on car, else the program terminates
            if (case_to_consider == true)
               {
                  System.out.println("An administration of a parking ticket is initiated. Data collection proceeds.");
                  //collection of data on the car that was detected with illegal parking minutes proceeds
                  //the ParkedCar object car saves the data, which becomes accessed by the police officer object
                  meter.setMinPurchased(mins_paid_for);
                  meter.setMinParked(mins_parked);
                  System.out.print("Make of the car: ");
                  car.setMake(scan.next());
                  System.out.print("Model of the car: ");
                  car.setModel(scan.next());
                  System.out.print("Color of the car: ");
                  car.setColor(scan.next());
                  System.out.print("License number of the car: ");
                  car.setLicense(scan.next());
                  System.out.println("\n");
                  //police officer registers data on the car
                  //police officer object issues a parking ticket on the car inspected
                  PoliceOfficer officer_ = new PoliceOfficer(meter, car, officer);                            
               }
         }
   }
