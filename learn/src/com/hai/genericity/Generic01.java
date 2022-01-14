package com.hai.genericity;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        // 创建三个学生对象，并放入HashSet中
        Student mary = new Student("mary", 19);
        Student messi = new Student("messi", 22);
        Student ball = new Student("ball", 21);

        // 创建HashSet对象, 并使用泛型规范输入的对象为Student
        HashSet<Student> set = new HashSet<>();
        set.add(mary);
        set.add(messi);
        set.add(ball);

        // use enhance for
        for(Student student : set) {
            System.out.println(student.getName() + "-" + student.getAge());
        }

        // use iterator
        // 创建迭代器对象
        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName() + "-" + student.getAge());
        }




    }
}
