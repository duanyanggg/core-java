package com.yang.abstruct;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Test01 {
    public static void main(String[] args) {
    B b = new B(new InterB() {
        @Override
        public void showB() {
            System.out.println("hh");
        }
    });
    b.methodB();

    }
}

//定义一个接口
interface InterB {
    void showB();
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();
    }
}
