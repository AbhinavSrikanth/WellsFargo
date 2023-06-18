public class PurchaseRecord {

    private Long recordId;

    private Portfolio portfolio;

    private Security security;

    // Additional attributes
    private double purchasePrice;
    private int quantity;

    public PurchaseRecord() {
    }

    public PurchaseRecord(Portfolio portfolio, Security security, double purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getRecordId() {
        return recordId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
