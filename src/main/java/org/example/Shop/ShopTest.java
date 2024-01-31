package org.example.Shop;

 /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        Product product1 = new Product(20, "Product1");
        Product product2 = new Product(10, "Product2");
        Product product3 = new Product(30, "Product3");

        shop.setProducts(Arrays.asList(product1, product2, product3));

        List<Product> sortedProducts = shop.sortProductsByPrice();

        assertThat(sortedProducts).containsExactly(product2, product1, product3);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        Product product1 = new Product(20, "Product1");
        Product product2 = new Product(10, "Product2");
        Product product3 = new Product(30, "Product3");

        shop.setProducts(Arrays.asList(product1, product2, product3));

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        assertThat(mostExpensiveProduct).isEqualTo(product3);
    }
}