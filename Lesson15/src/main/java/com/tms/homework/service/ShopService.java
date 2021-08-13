package com.tms.homework.service;

import com.tms.homework.exceptions.ProductAlreadyExistsException;
import com.tms.homework.model.Product;

import java.util.List;

public interface ShopService {

    void addProduct(Product product) throws ProductAlreadyExistsException;

    boolean startShop();

    List<Product> getAllProduct();

    void closeShop();
}
