package models;

import enums.ProductCategory;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class Products {
    List<Product> products= new ArrayList<>();

    public void addProduct(){

    }
    public List<Product>  getProductsByCategory(ProductCategory category){
        List<Product> list= new ArrayList<>();
        products.forEach(x->{if (x.getProductCategory()==category)list.add(x);});
        return list;
    }
}
