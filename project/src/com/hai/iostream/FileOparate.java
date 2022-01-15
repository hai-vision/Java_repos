package com.hai.iostream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */
@SuppressWarnings({"all"})
public class FileOparate {
    public static void main(String[] args) {
        // 判断文件是否存在，如果存在则删除
        String filePath = "E:\\news.txt";
        // 创建文件对象
        File file = new File(filePath);
        System.out.println(file.getName());
    }

    @Test
    public void delete1() {
        // 判断文件是否存在，如果存在则删除
        String filePath = "E:\\news.txt";
        // 创建文件对象
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } else {
            System.out.println("文件不存在！");
        }
    }

    @Test
    public void createFile1 () {
        // 判断文件是否存在，如果不存在则创建
        String filePath = "E:\\tmp\\yj.txt";
        File file = new File(filePath);
        if(!file.exists()){
            // 创建文件
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            return;
        }
    }

    @Test
    public void createFile () {
        String filePath = "E:\\tmp\\a\\b\\c";
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("文件已存在");
        } else{
            // mkdirs: 创建多级目录
            if(file.mkdirs()) {
                System.out.println("目录创建成功！");
            } else {
                System.out.println("创建失败");
            }
        }
    }

    @Test
    public void demo () {
        char[] ch = {'a', 'b'};
        String s = new String(ch);
        System.out.println(s);
    }


}


