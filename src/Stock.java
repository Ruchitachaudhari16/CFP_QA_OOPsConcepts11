public class Stock {
    //instance variable ompanyName,stockName,numberOfShares,sharePrice)
    String companyName;
    String stockName;
    int numberOfShares;
    double sharePrice;

    public Stock(String companyName, String stockName, int numberOfShares, double sharePrice) {
        this.companyName = companyName;
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getShareName() { //gettersetter method
        return companyName;
    }

    public void setShareName(String companyName) {
        this.companyName= companyName;
    }

    public int getNoOfShare() {
        return numberOfShares;
    }

    public void setNoOfShare(int noOfShare) {
        this.numberOfShares = noOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double calculateStockValues()
    {
        return  sharePrice* numberOfShares;
    }
   /* public double remainingShare()
    {
        return  noOfStocks-noOfShare;
    }*/
}
