package com.yang.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class menu {

    //登陆后页面
    public static void start() {

        //欢迎界面
        System.out.println("-------------欢迎来到黑马学生管理系统----------------\n" +
                "1：添加学生\n" +
                "2：删除学生\n" +
                "3：修改学生\n" +
                "4：查询学生\n" +
                "5：退出\n" +
                "请输入您的选择:\n");

        //获取键盘录入
        Scanner sc = new Scanner(System.in);
        char ch;
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            ch = sc.next().charAt(0);
            if (ch > '0' && ch < '5') {
                choose(ch, list);
                System.out.println("您可以继续选择：");
            } else if (ch == '5') {
                System.out.println("正在退出");
                break;
                //停止虚拟机运行
                //System.exit(0);
            } else {
                System.out.println("输入错误， 请输入1到5中的一个数字");
            }
        }
        System.out.println("欢迎下次使用");
    }

    //选择调用
    public static void choose(char ch, ArrayList<Student> list) {
        switch (ch) {
            case '1' -> addStudent(list);
            case '2' -> deleteStudent(list);
            case '3' -> updateStudent(list);
            case '4' -> queryStudent(list);
            default -> System.out.println("错误");
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        String id = sc.next();

        //学生ID已经存在，返回菜单
        if (contain(id, list) == true) {
            System.out.println("学生id已经存在，请选择更改选项");
            return;
        }

        //学生ID不存在
        //创建新的学生对象
        Student stu = new Student();
        stu.setId(id);
        System.out.println("请输入学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生地址");
        stu.setAddress(sc.next());
        list.add(stu);
        System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        String id = sc.next();

        //学生ID不存在，返回菜单
        if (contain(id, list) == false) {
            System.out.println("学生id不存在，请检查id是否正确");
            return;
        }
        int index = searchId(id, list);
        list.remove(index);
        System.out.println("删除完成");
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        String id = sc.next();

        //学生ID不存在，返回菜单
        if (contain(id, list) == false) {
            System.out.println("学生id不存在，请检查id是否正确");
            return;
        }

        int index = searchId(id, list);

        Student stu = list.get(index);

        System.out.println("请输入学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生地址");
        stu.setAddress(sc.next());
        System.out.println("修改成功");
    }

    //查询打印学生信息
    public static void queryStudent(ArrayList<Student> list) {
        //空集合
        if (list.size() == 0) {
            System.out.println("无学生信息，请添加后查询");
            return;
        }

        //循环打印学生信息
        System.out.println("id" + "\t\t" + "姓名"
                + "\t" + "年龄" + "\t" + "地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName()
                    + "\t" + stu.getAge()+ "\t" + stu.getAddress());
        }
    }

    //查询ID是否存在
    public static boolean contain(String id, ArrayList<Student> list) {
        if (searchId(id, list) == -1) {
            return false;
        }
        return true;
    }

    //寻找索引
    public static int searchId(String id, ArrayList<Student> list) {
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id.equals(stu.getId())) {
                result = i;
            }
        }
        return result;
    }
}
