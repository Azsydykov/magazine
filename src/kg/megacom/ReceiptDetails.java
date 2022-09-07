package kg.megacom;

public class ReceiptDetails {

    private String productName;
    private double sum;

    public ReceiptDetails() {
    }

    public ReceiptDetails(String productName, double sum) {
        this.productName = productName;
        this.sum = sum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
