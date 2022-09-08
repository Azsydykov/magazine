package kg.megacom.service;


import kg.megacom.Cashier;
import kg.megacom.Order;
import kg.megacom.Receipt;
import kg.megacom.enums.ProductCategory;
import kg.megacom.Product;

import java.util.List;
import java.util.SplittableRandom;

public interface Operation {


    Receipt getReceipt (Order order);

    void getCategory();
    Product[] getProductByCategory(String category);

Product getProductByName (String productName);
Cashier getCashierByName (String cashier);

}
