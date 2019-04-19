package com.trl.grasp.information_expert;

public class OrderItem {

    public OrderItem() { }
    
    public static Goods newGoods (String name,double price){
        return new Goods(name,price);
    }
    
    public static double countValueTotalGoods(Goods goods, int amountGoodsCurrent){
        return goods.getPriceGoods() * amountGoodsCurrent;
    }
}
