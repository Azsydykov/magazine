package kg.megacom.service;


import kg.megacom.Cashier;
import kg.megacom.Order;
import kg.megacom.Receipt;
import kg.megacom.enums.ProductCategory;
import kg.megacom.Product;

import java.util.List;

public interface Operation {


    Receipt getReceipt (Order order);

    void getCategory();
    Product[] getProductCategories(String category);

}
