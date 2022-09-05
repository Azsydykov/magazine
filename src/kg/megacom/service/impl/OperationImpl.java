package kg.megacom.service.impl;

import kg.megacom.*;
import kg.megacom.enums.ProductCategory;
import kg.megacom.enums.MeasureType;
import kg.megacom.service.Operation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class OperationImpl implements Operation {

    ArrayList<Product> products = new ArrayList<>();



    Sugar sugar = new Sugar ("Сахар", 90, MeasureType.Kg, ProductCategory.DAIRY);
    Water water = new Water("Вода", 25, MeasureType.L, ProductCategory.BEVERAGES);
    Tomato tomato = new Tomato("Помидор", 45, MeasureType.Kg, ProductCategory.VEGETABLES);
    Apple apple = new Apple("Яблоко", 110, MeasureType.Kg, ProductCategory.FRUIT);

    Cashier aibek = new Cashier("Айбек", "aiba", (byte) 24, 1);
    Cashier jibek = new Cashier("Жибек", "jiba", (byte) 22, 2);



    @Override
    public Receipt getReceipt(Order order) {
        return null;
    }

    @Override
    public Cashier getCashier(String name) {
        return null;
    }

    @Override
    public ProductCategory[] getProductCategories() {


        return ProductCategory.values();
    }

    public List<Product> getProductsByCategory (ProductCategory category) {
        List<Product> list = new ArrayList<>();
        products.forEach(x -> {
            if (x.getProductCategory() == category) list.add(x);
        });
        return list;
    }


    public void getVegetables() {
        List<Product> list = getProductsByCategory(ProductCategory.VEGETABLES);
        //print
    }

    @Override
    public void categorySelection(ProductCategory productCategory) {




        
    }

}
