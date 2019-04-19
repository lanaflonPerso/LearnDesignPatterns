package com.trl.grasp.information_expert;

import java.util.Arrays;
import java.util.List;

public class Order {
    private List<Double> orderItems = Arrays.asList(
            OrderItem.countValueTotalGoods(OrderItem.newGoods("Manzana", 0.20), 10),
            OrderItem.countValueTotalGoods(OrderItem.newGoods("Patatas", 0.30), 10),
            OrderItem.countValueTotalGoods(OrderItem.newGoods("Platanos", 1.10), 5));

    public Order() {

    }

    public double orderValueTotal(){
        double total = 0;
        for (Double d : orderItems) {
            total = total + d;
        }
        return total;
    }

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderValueTotal());
    }

}
