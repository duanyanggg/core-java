package demo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/19
 */
public class Demo2 {
    public static void main(String[] args){
        //jdk 10以后变量声明方式，java自己推断， ！var; (需要初始值)
        var a = 10;

        //标识符
        /*命名用的
        不能数字开头，无#
        没长度限制
        不能有空格*/

        //一次性声明多个变量
        int b,c;
        //长整型，后面加L；
        long x = 12345567880123L;
        //必须加f，1符号 8指数，23尾数，能表示七/八位精度（从左侧第一个不为零的数开始）
        float y = 3.141233f;
        //1，11，52，15/16/17位精度
        //二进制0b,十进制0x
    }

}
