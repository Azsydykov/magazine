package kg.megacom;

import kg.megacom.enums.MeasureType;
import kg.megacom.enums.ProductCategory;

public class Apple extends Product{
    public Apple(String name, double cost, MeasureType measureType, ProductCategory productCategory) {
        super(name, cost, measureType, productCategory);
    }
}
