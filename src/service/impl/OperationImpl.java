package service.impl;

import enums.ProductCategory;
import service.Operation;

public class OperationImpl implements Operation {


    @Override
    public ProductCategory[] getProductCategory() {
        return new ProductCategory[0];
    }
}
