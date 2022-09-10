package kg.megacom;

import java.util.Arrays;

public class Receipt  {

    private String name;
    private double totalSum;
    private double totalDiscount;
    private ReceiptDetails[] receiptDetails;


    public Receipt(double totalSum, double totalDiscount, ReceiptDetails[] receiptDetails) {
        this.totalSum = totalSum;
        this.totalDiscount = totalDiscount;
        this.receiptDetails = receiptDetails;
    }

    public Receipt() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public ReceiptDetails[] getReceiptDetails() {
        return receiptDetails;
    }

    public void setReceiptDetails(ReceiptDetails[] receiptDetails) {
        this.receiptDetails = receiptDetails;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "name='" + name + '\'' +
                ", totalSum=" + totalSum +
                ", totalDiscount=" + totalDiscount +
                ", receiptDetails=" + Arrays.toString(receiptDetails) +
                '}';
    }
}
