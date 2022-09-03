package service.impl;

import enums.MeasureType;
import enums.ProductCategory;
import models.Product;
import models.Sugar;
import service.Operation;

import java.util.ArrayList;
import java.util.List;


public class OperationImpl implements Operation {

    List<Product> products = new ArrayList<>();

    @Override
    public ProductCategory[] getProductCategories() {


        return ProductCategory.values();
    }

    public List<Product> getProductsByCategory(ProductCategory category) {
        List<Product> list = new ArrayList<>();
        products.forEach(x -> {
            if (x.getProductCategory() == category) list.add(x);
        });
        return list;
    }

    @Override
    public void addSugar() {
        Sugar sugar = new Sugar("Сахар", 90, MeasureType.Kg, ProductCategory.DAIRY);
        products.add(sugar);

    }

    public void getVegetables() {
        List<Product> list = getProductsByCategory(ProductCategory.VEGETABLES);
        //print
    }
}
