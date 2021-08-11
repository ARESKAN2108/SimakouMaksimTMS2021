package com.tms.homework.service;

import com.tms.homework.exceptions.ProductAlreadyExistsException;
import com.tms.homework.model.Product;
import com.tms.homework.model.Shop;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final Shop shop;

    @Override
    public void addProduct(Product product) throws ProductAlreadyExistsException {
        if (shop.getProducts().stream().noneMatch(pr -> pr.getId() == product.getId())) {
            shop.getProducts().add(product);
        } else {
            throw new ProductAlreadyExistsException("Товар с таким Id " + product.getId() + " уже существует");
        }
    }

    @Override
    public boolean startShop() {
        return shop.isRunShop();
    }

    @Override
    public List<Product> getAllProduct() {
        return shop.getProducts();
    }

    @Override
    public void closeShop() {
        shop.setRunShop(false);
    }
}
