package kg.megacom;

import kg.megacom.enums.MeasureType;
import kg.megacom.enums.ProductCategory;

public class Water extends Product{
    public Water(String name, double cost, MeasureType measureType, ProductCategory category) {
        super(name, cost, measureType, category);
    }

    public Water() {
    }
}
