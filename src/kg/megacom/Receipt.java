package kg.megacom;

public class Receipt  {
    private double totalSum;
    private double discount;
    private String productName;
  private double sum;

    public Receipt(double totalSum, double discount, String productName, double sum) {
        this.totalSum = totalSum;
        this.discount = discount;
        this.productName = productName;
        this.sum = sum;
    }

    public Receipt(){};

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
