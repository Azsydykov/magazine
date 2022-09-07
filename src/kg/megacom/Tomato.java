package kg.megacom;

import kg.megacom.enums.MeasureType;
import kg.megacom.enums.ProductCategory;

public class Tomato extends Product {
    public Tomato(String name, double cost, MeasureType measureType, ProductCategory category) {
        super(name, cost, measureType, category);
    }

    public Tomato() {
    }
}
