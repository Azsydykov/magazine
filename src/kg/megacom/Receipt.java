package kg.megacom;

public class Receipt  {
    private double totalSum;
    private double discount;
    private ReceiptDetails[] receiptDetails;

    public Receipt(double totalSum, double discount, ReceiptDetails[] receiptDetails) {
        this.totalSum = totalSum;
        this.discount = discount;
        this.receiptDetails = receiptDetails;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public ReceiptDetails[] getReceiptDetails() {
        return receiptDetails;
    }

    public void setReceiptDetails(ReceiptDetails[] receiptDetails) {
        this.receiptDetails = receiptDetails;
    }
}
