package kg.megacom.service.impl;

import kg.megacom.*;
import kg.megacom.enums.ProductCategory;
import kg.megacom.enums.MeasureType;
import kg.megacom.service.Operation;

import java.util.Arrays;


public class OperationImpl implements Operation {


    Sugar sugar = new Sugar("Сахар", 90, MeasureType.Kg, ProductCategory.DAIRY);
    Water water = new Water("Легенда", 25, MeasureType.L, ProductCategory.BEVERAGES);
    Tomato tomato = new Tomato("Помидор", 45, MeasureType.Kg, ProductCategory.VEGETABLES);
    Apple apple = new Apple("Яблоко", 110, MeasureType.Kg, ProductCategory.FRUIT);

    Pear pear = new Pear("Груша", 100, MeasureType.Kg, ProductCategory.FRUIT);

    Cashier aibek = new Cashier("Айбек", "aiba", 24);
    Cashier jibek = new Cashier("Жибек", "jiba", 22);

    Product[] products = {sugar, water, tomato, apple, pear};
    Cashier[] cashiers = {aibek, jibek};


    @Override
    public Receipt getReceipt(Order order) {

       Receipt receipt = new Receipt();


       Details[] details = order.getDetails();
       double totalSum = 0;
       double totalDiscount=0;
       ReceiptDetails[] receiptDetails = new ReceiptDetails[10];


       for (int i = 0; i< details.length; i++ ){
           if(details[i]!=null) {
               Product product = details[i].getProduct();
               double cost = product.getCost() * details[i].getAmount();
               double discount =( cost * details[i].getDiscount()) / 100;
               totalSum = totalSum + (cost - discount);
               totalDiscount = totalDiscount + discount;
               receiptDetails[i].setProductName(product.getName());
               receiptDetails[i].setSum(cost-discount);

           }
       }
       receipt.setName(order.getCashier().getName());
       receipt.setTotalDiscount(totalDiscount);
       receipt.setTotalSum(totalSum);




        return null;
    }

    @Override
    public void getCategory() {
        for (ProductCategory item : ProductCategory.values()) {
            System.out.println(item.name());
        }
    }

    @Override
    public Product[] getProductByCategory(String category) {

        Product[] result = new Product[10];
        int j = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals(ProductCategory.valueOf((category)))) {
                {
                    result[j] = products[i];
                    j++;

                }
            }

        }

        return result;

    }

    @Override
    public Product getProductByName(String productName) {
        for (Product item: products){
            if (productName.equals(item.getName())){
                return item;
            }
        }
        return null;
    }

    @Override
    public Cashier getCashierByName(String cashier) {

        for (Cashier item : cashiers){
            if (item.getName().equals(cashier))
                return  item;
        }
        return null;
    }
}

