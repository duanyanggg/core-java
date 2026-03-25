package com.yang.stringBuilderDemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        StringBuilder sb = new StringBuilder();
        if (arr == null) {
            System.out.println("");
            return;
        }

        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
