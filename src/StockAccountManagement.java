import java.util.Scanner;

public class StockAccountManagement {
    /*UC1* Stock account management*/
    public static void main(String[] args) {
        StcockPortfolio sp = new StcockPortfolio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stocks");
        int numberOfStockks = sc.nextInt();
        for (int stock=0;stock<numberOfStockks;stock++)
        {
            System.out.println("\n Enter Stock  details"+(stock+1));
            System.out.println("Company name:");
            String companyName=sc.nextLine();
            //Stock Name
            System.out.println("Stock Name:");
            String stockName=sc.nextLine();
            //Number of shares
            System.out.println("Number of Shares");
            int numberOfShares=sc.nextInt();
            System.out.println("Share Price");
            double sharePrice=sc.nextDouble();


            Stock stoc=new Stock(companyName,stockName,numberOfShares,sharePrice) ;
            sp.addStock(stoc);
        }
        sp.DisplayStock();
    }
}
