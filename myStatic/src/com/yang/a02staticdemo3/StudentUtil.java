package com.yang.a02staticdemo3;

import com.yang.a02staticdemo2.ArrayUtil;

import java.util.ArrayList;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
//学生工具类
public class StudentUtil {
    private void StudentUtil() {};
    //获取集合中最大学生的年龄
    public static int getMaxAge(ArrayList<Student> list) {
        int max = -1;
        if (list == null || list.isEmpty()) {
            return max;
        }
        for (Student student : list) {
            int age = student.getAge();
            if (max < age) {
                max = age;
            }
        }
        return max;
    }
}
