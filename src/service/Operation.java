package service;


import enums.ProductCategory;
import models.Details;
import models.Order;
import models.Product;

import java.util.List;

public interface Operation {
    ProductCategory[] getProductCategories();
    public List<Product>  getProductsByCategory(ProductCategory category);

void addSugar();
    void getVegetables();

}
