package com.hai.commonclass.stringbuffer_;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        /*
            1. 先将String转化为StringBuffer
         */
        String price = "256879";
        StringBuffer buffer = new StringBuffer(price);


        /*
            1. 找到小数点的位置
            2. 在小数点前三位差一个 ','


         */
        if (buffer.lastIndexOf(".") == -1) {
            for(int i = buffer.length()-3; i > 0; i -= 3){
                buffer = buffer.insert(i, ",");
            }

        } else {

            for (int i = buffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
                buffer = buffer.insert(i, ",");
            }
        }

        System.out.println(buffer);
    }
}
