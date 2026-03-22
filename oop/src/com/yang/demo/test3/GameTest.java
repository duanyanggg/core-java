package com.yang.demo.test3;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role R1 = new Role("Hero", 100,'女');
        //创建第二个角色
        Role R2 = new Role("Monster", 100, ' ');
        //开始格斗 回合制游戏
        while (true) {
            //R1攻击R2
            R1.attack(R2);
            //判断R2剩余血量
            if (R2.getBlood() == 0) {
                System.out.println(R1.getName() + "胜利");
                break;
            }
            //R1攻击R2
            R2.attack(R1);
            //判断R2剩余血量
            if (R1.getBlood() == 0) {
                System.out.println(R2.getName() + "胜利");
                break;
            }
        }
    }
}
