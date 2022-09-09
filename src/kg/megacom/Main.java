package kg.megacom;

import kg.megacom.enums.ProductCategory;
import kg.megacom.service.Operation;
import kg.megacom.service.impl.OperationImpl;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operation operation = new OperationImpl();
        byte answer=0;
        int count =0;
        System.out.println(count);
        Details[] details = new Details[10];
         System.out.println("Добро пожаловать");
         while (answer !=1){
             System.out.println("Выберите категорию продуктов");
              operation.getCategory();
              String category = scanner.next();
              Product[] products = operation.getProductByCategory(category);
          //   System.out.println(products.length);

             for (Product item:products){
                 if (item!=null)
                     item.getInfo();

             }
             System.out.println("Выберите продукт ");
             String productName = scanner.next();
             Product product = operation.getProductByName(productName);
             System.out.println("Выберите количество ");
             int amount = scanner.nextInt();
             System.out.println("Выберите скидку ");
             int discount = scanner.nextInt();
             Details detail = new Details (product, amount, discount);
             details[count]= detail;

             System.out.println("Продолжаете? 1 нет, 0 да");
             answer = scanner.nextByte();
             count++;
         }

        for (Details item: details){
            if (item!=null)
                System.out.println(item);
        }

         System.out.println("Выберите кассира");
         String cashier = scanner.next();

         Cashier res = operation.getCashierByName(cashier);
         Order order = new Order();
         order.setDetails(details);
         order.setCashier(res);

         Receipt receipt = operation.getReceipt(order);

        System.out.println(receipt);





    }
}
