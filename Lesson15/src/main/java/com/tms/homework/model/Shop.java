package com.tms.homework.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Shop {
    private List<Product> products;
    private boolean RunShop = true;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }
}
