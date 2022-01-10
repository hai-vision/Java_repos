package com.hai.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        // 第一代日期
        Date date = new Date();

        // 获取当前系统时间
        System.out.println(date);

        // 创建一个SimpleDateFormat对象，对日期格式进行转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(date);
        System.out.println(format);

        String str = "2022年01月10日 9:31:56 星期一";
        date = sdf.parse(str);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
//        StringBuilder st = new StringBuilder();
//        st.append(calendar.get(Calendar.YEAR));
//        st.append(calendar.get(Calendar.MONTH)).append(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(st);

//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd HH:mm:ss");
        String format1 = dateTimeFormatter.format(now);
        System.out.println(format1);

    }

}
