package kg.megacom.service.impl;

import kg.megacom.*;
import kg.megacom.enums.ProductCategory;
import kg.megacom.enums.MeasureType;
import kg.megacom.service.Operation;

import java.util.ArrayList;
import java.util.List;


public class OperationImpl implements Operation {




    Sugar sugar = new Sugar ("Сахар", 90, MeasureType.Kg, ProductCategory.DAIRY);
    Water water = new Water("Легенда", 25, MeasureType.L, ProductCategory.BEVERAGES);
    Tomato tomato = new Tomato("Помидор", 45, MeasureType.Kg, ProductCategory.VEGETABLES);
    Apple apple = new Apple("Яблоко", 110, MeasureType.Kg, ProductCategory.FRUIT);

    Cashier aibek = new Cashier("Айбек", "aiba", 24);
    Cashier jibek = new Cashier("Жибек", "jiba", 22);

Product[] products = {sugar, water, tomato, apple};


    @Override
    public Receipt getReceipt(Order order) {
        return null;
    }

    @Override
    public void getCategory() {
        for (ProductCategory item: ProductCategory.values()){
            System.out.println(item.name());
        }
    }

    @Override
    public Product[] getProductCategories(String category) {
        Product[] result = new Product[100];

        for (Product product : products){
            if (product.getProductCategory().equals(category)){
            result[0] = product;
            }
        }

        return new Product[0];
    }


}
