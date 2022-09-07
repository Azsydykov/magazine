package kg.megacom;

public class Details {

    private Product product;
    private int amount;
    private double discount;



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Details{" +
                "product=" + product +
                ", amount=" + amount +
                ", discount=" + discount +
                '}';
    }
}
