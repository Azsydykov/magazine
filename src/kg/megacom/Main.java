package kg.megacom;

import kg.megacom.enums.ProductCategory;
import kg.megacom.service.Operation;
import kg.megacom.service.impl.OperationImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operation operation = new OperationImpl();
        System.out.println("Добро пожаловать");
        System.out.println("Выберите категорию продуктов");

       operation.getCategory();
        String category = scanner.next();

       Product[] products = operation.getProductCategories(category);




      //  ProductCategory[] productCategories = operation.getProductCategories();
      //System.out.println(Arrays.toString(ProductCategory.values()));



        Order order= new Order();
      //  String name = scanner.nextLine();



    }
}
