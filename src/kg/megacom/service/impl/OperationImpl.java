package kg.megacom.service.impl;

import kg.megacom.*;
import kg.megacom.enums.ProductCategory;
import kg.megacom.enums.MeasureType;
import kg.megacom.service.Operation;

import java.util.ArrayList;
import java.util.List;


public class OperationImpl implements Operation {

    List<Product> products = new ArrayList<>();
   


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

    @Override
    public void addSugar() {
        Sugar sugar = new Sugar("Сахар", 90, MeasureType.Kg, ProductCategory.DAIRY);
        products.add(sugar);

    }

    public void getVegetables() {
        List<Product> list = getProductsByCategory(ProductCategory.VEGETABLES);
        //print
    }

    @Override
    public void categorySelection(ProductCategory productCategory) {




        
    }

}
