//Name: Amir Aslamov
/*Description of the Prorgram: This program calculates the amount of stock purchased by Jack,
                               the total commission he paid and the total profit he made, with
                               a specific number of stocks and at a specific rate of commission*/
                               
  public class StockTransaction
  {
      public static void main (String [] args)
         {
          int SharesBought;          //This variable represents the total number of shares of stock Jack purchased
          double ShareCost;          //This variable represents the amount Jack paid for each share of stock, in dollars
          double StockCost;          //This variable represents the total cost Jack paid for the stock, in dollars
          double CommissionRate;     //This variable represents the rate of commission, in percentage, that Jack paid at to his stock broker 
          double CommissionCost;     //This variable represents the total cost Jack paid to the stock broker, in dollars
          double TotalCost;          //This variable represents the total cost Jack incurred after he bought the stock and paid the commission, in dollars
          
          int SharesSold;            //This variable represents the total number of shares of stock Jack sold
          double SharePrice;         //This variable represents the price Jack sold each stock at, in dollars
          double StockSale;          //This variable represents the total amount of money Jack made after selling his stock, in dollars
          double CommissionRateSale; //This variable represents the rate of commission, in percentage, that Jack paid at for the sale of his stock 
          double CommissionSaleCost; //This variable represents the total amount of commission Jack paid his stock broker for his sale of the stock, in dollars
          double SaleProfit;         //This variable represents the total amount of money, in dollars, Jack made after he sold his stock and paid the sale commission
          double OverallProfit;      //This variable represents the total profit overall Jack made after this stock transaction, in dollars
          
         
          SharesBought = 1000;
          ShareCost = 45.83;
          StockCost = SharesBought * ShareCost;
          CommissionRate = 1.50;
          CommissionCost = StockCost * CommissionRate * 0.01; //Multiplication by 0.01 takes percentage into account
          TotalCost = StockCost + CommissionCost;
          
          SharesSold = 1000;
          SharePrice = 50.79;
          StockSale = SharesSold * SharePrice;
          CommissionRateSale = 1.50;
          CommissionSaleCost = StockSale * CommissionRateSale * 0.01;  //Multiplication by 0.01 takes percentage into account
          SaleProfit = StockSale - CommissionSaleCost;
          OverallProfit = SaleProfit - TotalCost;
          
          
             System.out.println("The total amount of cost Jack paid for his stock after he bought a total number of "
                              + SharesBought + " shares at the price of $" + ShareCost + " each was $" + StockCost);
                
             System.out.println("The total commission Jack paid his broker when he bought the stock was $" + CommissionCost
                              + " (at the commission rate of " + CommissionRate + "% of the stock sale)");
                              
             System.out.println("The amount Jack sold the stock he bought for was $" + StockSale + " (at the price of $" +
                              SharePrice + " for each of the " + SharesSold + " shares of the stock sold)");
          
             System.out.println("The amount of commission Jack paid his broker when he sold the stock was $" + CommissionSaleCost);
          
             System.out.println("The amount of profit Jack made after selling his stock and paying the two commissions to his broker was $"
                                 + OverallProfit);
 
 
  }        
          
         }
                  
