package com.yang.test;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class Test2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        System.out.println(match(strA, strB));

        //charToArray 将字符串拆分为字符数组
        char[] arr = strA.toCharArray();
    }
    public static boolean match(String str1, String str2) {
        boolean result = false;
        if (str1.length() == str2.length()) {
            for (int i = 1; i < str1.length(); i++) {
                System.out.println(str1);
                if (str1.equals(str2)) {
                    result = true;
                    break;
                }
                str1 = move(str1);
            }
        }
        return result;
    }

    public static String move (String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(1));
        sb.append(str.charAt(0));
        return sb.toString();
    }
}
