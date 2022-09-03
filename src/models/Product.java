package models;

import enums.MeasureType;
import enums.ProductCategory;

public abstract class Product {
    private String name;
    private double cost;
    private MeasureType measureType;
    private ProductCategory productCategory;



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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Product(String name, double cost, MeasureType measureType, ProductCategory productCategory) {
        this.name = name;
        this.cost = cost;
        this.measureType = measureType;
        this.productCategory = productCategory;
    }
}
