package com.yang.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/25
 */
public class app {
    public static void main(String[] args) {
        //登陆界面
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码");

        //创建用户集合储存信息
        ArrayList<User> list = new ArrayList<>();
        char choose;

        //输入
        Scanner sc = new Scanner(System.in);
        lable:
        while (true) {
            choose = sc.next().charAt(0);
            if (choose > '0' && choose < '5') {
                switch (choose) {
                    case '1' -> login(list);
                    case '2' -> register(list);
                    case '3' -> forgetPassword(list);
                    case '4' -> {
                        System.out.println("正在退出");
                        break lable;
                    }
                    default -> System.out.println("错误");
                }
            } else {
                System.out.println("输入错误，请输入1到3中的一个数字");
            }
        }
    }

    //登录
    public static void login(ArrayList<User> list) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        //判断用户名是否存在
        if (!searchName(username, list)) {
            System.out.println("用户未注册，请先注册");
            return;
        }

        //判断验证码是否正确
        String vCode = getVerificationCode();
        while (true) {
            System.out.println("请输入验证码");
            String uCode = sc.next();
            if (vCode.equals(uCode))
                break;
            System.out.println("验证码错误，请重输");
        }

        //判断用户名，密码是否正确，三次机会
        for (int i = 0; i < 3; i++) {
            if (searchUser(username, password, list)) {
                System.out.println("登录成功");
                menu.start();
                break;
            }
            System.out.println("用户名或密码错误，请重输");
        }
        return;
    }

    //判断用户名是否存在
    public static boolean searchName(String username, ArrayList<User> list) {
        boolean flag = false;
        for (User user : list) {
            if (user.getUsername().equals(username)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //判断密码和用户名是否正确
    public static boolean searchUser(String username, String password, ArrayList<User> list) {
        boolean flag = false;
        for (User user : list) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return true;
                } else {
                    break;
                }
            }
        }
        return flag;
    }

    //生成随机验证码
    /*验证码规则：长度为5
    由4位大写或者小写字母和1位数字组成，
    同一个字母可重复
    数字可以出现在任意位置*/
    public static String getVerificationCode() {
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //2.要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            //把随机字符添加到sb当中
            sb.append(c);
        }

        //3.把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //4.如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        //最大索引指向的元素 跟随机索引指向的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);

    }

    //注册
    public static void register(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);

        //检测用户名
        while (true) {
            //键盘输入用户名
            System.out.println("请输入你的用户名：");

            //用户名唯一
            //用户名长度必须在3~15位之间
            //只能是字母加数字的组合，但是不能是纯数字
            String userName = sc.next();
            if (!searchName(userName, list)) {
                if (userName.length() > 2 && userName.length() < 16) {
                    if (checkName(userName)) {
                        break;
                    }
                }
            }
            System.out.println("用户名已经存在或格式错误，请重输");
        }

        //密码键盘输入两次，两次一致才可以进行注册。
       while (true) {
           System.out.println("请输入你的密码");
           String password = sc.next();
           System.out.println("请再次输入密码，确保密码无误");
           String second = sc.next();

           if (password.equals(second)) {
               break;
           }
           System.out.println("两次密码不同，请重新设置密码");
       }

       //身份证号验证
       /* 验证要求：
        长度为18位
        不能以0为开头
        前17位，必须都是数字
        最为一位可以是数字，也可以是大写X或小写x*/
        while (true) {
            System.out.println("请输入你的身份证号");
            String idCardCode = sc.next();
            if(checkIdCardCode(idCardCode)) {
                break;
            }
            System.out.println("身份证号码格式错误，请重输");
        }

        //手机号验证
        while (true) {
            System.out.println("请输入你的手机号：");
            String phone = sc.next();
            if(checkPhone(phone)) {
                break;
            }
            System.out.println("手机号码格式错误，请重输");
        }

        return;
    }

    //检查名字是否是字母加数字的组合，但是不能是纯数字
    public static boolean checkName(String name) {
        boolean flag = true;
        //字母个数
        int cont = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z'))) {
                return false;
            }
            if (ch >= 'a') {
                cont++;
            }
        }
        return cont != 0;
    }

    //检查身份证号格式是否正确
    public static boolean checkIdCardCode(String id) {
        //长度为18位,不能以0为开头
        if (id.length() != 18 || id.charAt(0) == '0') {
            return false;
        }

        //前17位，必须都是数字
        for (int i = 1; i < 17; i++) {
            char ch = id.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        //最为一位可以是数字，也可以是大写X或小写x*
        char tail = id.charAt(17);
        return tail == 'X' || tail == 'x' || (tail > '0' && tail < '9');
    }

    //验证手机号是否正确
    /*验证要求：
        长度为11位
        不能以0为开头
        必须都是数字*/
    public static boolean checkPhone(String phone) {
        if (phone.length() != 11 || phone.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    //忘记密码
   /* 忘记密码：
    1，键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
    2，键盘录入身份证号码和手机号码
    3，判断当前用户的身份证号码和手机号码是否一致，
    如果一致，则提示输入密码，进行修改。
    如果不一致，则提示：账号信息不匹配，修改失败。*/
    public static void forgetPassword(ArrayList<User> list) {
        //键盘输入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.next();

        //判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
        if (!searchName(userName, list)) {
            System.out.println("用户未注册");
            return;
        }

        //键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码：");
        String idCardCode = sc.next();
        System.out.println("请输入手机号码");
        String phone = sc.next();

        //判断当前用户的身份证号码和手机号码是否一致
        //如果不一致，则提示：账号信息不匹配，修改失败。
        if (match(userName,idCardCode,phone,list)) {
            System.out.println("账号信息不匹配，修改失败");
            return;
        }

        //如果一致，则提示输入密码，进行修改。
        System.out.println("请输入新的密码");
        String password = sc.next();
        for (User user : list) {
            if (userName.equals(user.getUsername())) {
                user.setPassword(password);
                System.out.println("更改完成");
                break;
            }
        }
    }

    //判断当前用户的身份证号码和手机号码是否一致
    public static boolean match(String userName, String id, String phone, ArrayList<User> list) {
        for (User user : list) {
            if (user.getUsername().equals(userName)) {
                if (user.getIdCard().equals(id) && user.getPhone().equals(phone)) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
