package com.hai.exception.homework;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        /*
            1. 编写程序，接受命令行参数（整数），计算两数相除
            2. 计算两个数相除，使用cal(int n1, int n2)
            3. 对数据格式不正确，缺少命令行参数、除零进行处理
         */
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            // 可能会发生数据格式异常
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            // 调用cal方法, 可能会发生算术异常
            double res = cal(n1, n2);
            System.out.println("计算结果为：" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数个数不为2");

        } catch (NumberFormatException e) {
            System.out.println("数据格式不正确");
        } catch(ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
