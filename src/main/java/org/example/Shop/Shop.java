package org.example.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getCost));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products == null || products.isEmpty()) {
            return null;
        }

        return Collections.max(products, Comparator.comparingDouble(Product::getCost));
    }


}




