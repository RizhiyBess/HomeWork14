package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product milk = new Product("Молоко", 100);
        Product bread = new Product("Хлеб", 30);
        Product cheese = new Product("сыр", 200);
        Product potato = new Product("Картофель", 100);
        Product apple = new Product("Яблоки", 150);
        Product lemon = new Product("Лимон", 250);
        //1 Добавление продукта в корзину.
        basket.addingProduct(milk);
        basket.addingProduct(bread);
        basket.addingProduct(cheese);
        basket.addingProduct(potato);
        basket.addingProduct(apple);
        //2 Добавление продукта в заполненную корзину, в которой нет свободного места.
        basket.addingProduct(lemon);
        //3 Печать содержимого корзины с несколькими товарами.
        basket.printProduct();
        //4 Получение стоимости корзины с несколькими товарами.
        System.out.println("Стоимость корзины с товарами: " + basket.totalCost());
        //5 Поиск товара, который есть в корзине.
        System.out.println("Есть ли в корзине молоко? " + basket.checkingProductAvailability(milk.getNameProduct()));
        //6 Поиск товара, которого нет в корзине.
        System.out.println("Есть ли в корзине лимон? " + basket.checkingProductAvailability(lemon.getNameProduct()));
        //7 Очистка корзины.
        basket.clearBasket();
        //8 Печать содержимого пустой корзины.
        basket.printProduct();
        //9 Получение стоимости пустой корзины.
        System.out.println("Стоимость пустой корзины: " + basket.totalCost());
        //10 Поиск товара по имени в пустой корзине.
        System.out.println("Есть ли в корзине сыр? " + basket.checkingProductAvailability(cheese.getNameProduct()));
    }
}
