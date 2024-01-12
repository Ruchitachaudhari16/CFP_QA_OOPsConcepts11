import java.util.*;

public class StcockPortfolio
{
/* UC1- stock account manaemenr"*/
    //Create ArrayList of Stock Class.
    ArrayList<Stock> stocks = new ArrayList<>();
   //Add stock
    public void addStock(Stock stock)
    {
        stocks.add(stock);
    }
//calculate stock value
    double countTotalShareValue()
    {
        double countValue=0;
        for (Stock stock:stocks)
        {
            countValue+=stock.calculateStockValues();
        }
        return countValue;
    }
    public void DisplayStock() //Display Stock Report
    {
        System.out.println("Stock Report");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-15s %-20s %-15s %-15s%n", "Stock Name", "Number of Shares", "Share Price", "Stock Value");
        System.out.println("------------------------------------------------------");
        for (Stock stock : stocks) {
            System.out.printf("%-15s %-20d %-15.2f %-15.2f%n",
                    stock.stockName, stock.numberOfShares, stock.sharePrice, stock.calculateStockValues());
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("%-50s %-15.2f%n", "Total Portfolio Value",countTotalShareValue());
        System.out.println("------------------------------------------------------");
    }
    }
