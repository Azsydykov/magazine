package models;

import enums.ProductCategory;
import service.Operation;

public class Receipt  {
    private double sum;
    private double discount;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
