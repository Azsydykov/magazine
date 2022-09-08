package kg.megacom;

import kg.megacom.enums.MeasureType;
import kg.megacom.enums.ProductCategory;

public abstract class Product {
    private String name;
    private double cost;
    private MeasureType measureType;
    private ProductCategory category;

    public Product(String name, double cost, MeasureType measureType, ProductCategory category) {
        this.name = name;
        this.cost = cost;
        this.measureType = measureType;
        this.category = category;
    }

    public Product(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public void setMeasureType(MeasureType measureType) {
        this.measureType = measureType;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", cost=" + cost ;
    }


    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.cost);
    }
}
