package com.yang.basicdemo.test6;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class Student {

    private int id;
    private String name;

    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    //添加新的学生对象
    public static Student[] add(Student stu, Student[] students) {
        //已经存在
        if(contain(students, stu.getId())) {
            System.out.println("学生ID已经存在， 请勿重新输入");
            return students;
        }
        int count = getCount(students);
        if (count == students.length) {
            //原数组满了就让他指向新的扩充后的数组
            students = createNewArr(students);
        }
        students[count] = stu;
        return students;
    }

    //判断id是否已经存在
    public static boolean contain(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
           if (students[i] != null) {
               if (students[i].getId() == id) {
                   return true;
               }
           }
        }
        return false;
    }

    //判断现有学生数，返回学生数
    public static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建新的学生数组并返回
    public static Student[] createNewArr(Student[] students) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    //打印所有学生信息
    public static void printInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu != null) {
                System.out.println("学生ID是" + stu.id + ", 姓名是"
                        + stu.name + ", 年龄是" + stu.age);
            }
        }
    }

    //查找id对应学生在数组中的位置，返回下角标
    public static int getIndex(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu != null && stu.id == id) {
                return i;
            }
        }
        return -1;
    }

    //删除学生对象
    public static void delete(Student[] students, int id) {
        int index = getIndex(students, id);
        if (index < 0) {
            System.out.println("学生ID不存在，无法删除");
            return;
        }
        students[index] = null;
        return;
    }

    //查找对应ID的学生，并且给他的年龄加一
    public static void addAge(Student[] students, int id) {
        int index = getIndex(students, id);
        if (index < 0) {
            System.out.println("学生ID不存在，无法增加年龄");
            return;
        }
        Student stu = students[index];
        int age = stu.getAge();
        age++;
        stu.setAge(age);
        return;
    }
}
