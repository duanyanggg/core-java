package com.yang.basicdemo.test4;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods goods1 = new Goods("001","A",100,10);
        Goods goods2 = new Goods("002","B",110,20);
        Goods goods3 = new Goods("003","C",10,13);
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;
        for (int i = 0; i < goods.length; i++) {
            Goods g = goods[i];
            System.out.println(g.getId());
        }
    }
}
