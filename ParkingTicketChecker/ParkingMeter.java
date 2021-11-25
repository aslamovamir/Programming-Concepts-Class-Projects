public class ParkingMeter
   {
      private int park_min_purchased;
      private int park_min_parked;
      
      public ParkingMeter()
         {
            park_min_purchased = -1;
            park_min_parked = -1;
         }
      public ParkingMeter(int purchased, int parked)
         {
            this.park_min_purchased = purchased;
            this.park_min_parked = parked;
         }
      
      public void setMinPurchased(int purchased)
         {
            this.park_min_purchased = purchased;
         }
      public void setMinParked(int parked)
         {
            this.park_min_parked = parked;
         }
      
      public int getMinPurchased()
         {
            return park_min_purchased;
         }
      public int getMinParked()
         {
            return park_min_parked;
         } 
   }
