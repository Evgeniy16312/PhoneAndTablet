package com.example.phoneandtablet.practicePart1.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orders {
    Scanner in;
    List<Buyer> orders;
    List<Product> productList;

    public Orders() {
        in = new Scanner(System.in);
        orders = new ArrayList<>();
        productList = new ArrayList<>();
    }

    public void addNewProduct() {
        Product product = new Product();
        System.out.println('\n' + "Введите название продукта");
        product.setProdName(in.next());
        System.out.println("Введите цену");
        product.setProdPrice(in.nextDouble());
        productList.add(product);
    }

    public void makeOrders() {
        Buyer buyer = new Buyer();
        System.out.println('\n' + "Введите ваше имя");
        buyer.setName(in.next());
        System.out.println("Введите вашу фамилию");
        buyer.setFamily(in.next());
        System.out.println("Введите id продукта который хотите купить" + '\n');
        int i = 0;
        for (Product p : productList) {
            System.out.println("id:" + i + " " + p.toString());
            i++;
        }
        i = in.nextInt();
        buyer.setProductBuy(productList.get(i));
        System.out.println("Сколько денег платите:");
        buyer.setTransferredMoney(in.nextDouble());
        buyer.setBlackList(false);
        orders.add(buyer);
    }
}
