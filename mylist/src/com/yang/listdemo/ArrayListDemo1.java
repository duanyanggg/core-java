package com.yang.listdemo;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //<泛型>：限定集合中储存数据的类型
        //只能是引用数据类型，基本数据类型要用包装类
        ArrayList<String> list =  new ArrayList<>();

        //打印的是集合内的对象
        //会加上[]
        System.out.println(list);

        //2.添加元素
        boolean b = list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(b);
        System.out.println(list);

        //3.删除元素
        //返回是否删除成功
        boolean result = list.remove("aaa");
        System.out.println(result);
        System.out.println(list);

        //返回被删除的元素
        String re = list.remove(0);
        System.out.println(re);
        System.out.println(list);

        //4.修改元素， 返回被修改的元素
        String res = list.set(1, "ddd");
        System.out.println(res);
        System.out.println(list);

        //5.查询
        String str = list.get(0);
        System.out.println(str);
    }
}
