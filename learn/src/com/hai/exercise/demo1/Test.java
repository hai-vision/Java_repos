package com.hai.exercise.demo1;

public class Test {
    public static void main(String[] args) {
        Teacher lecturer = new Lecturer("ball", 31, "讲师", 10000);
        Teacher professor = new Professor("messi", 33, "教授", 15000);
        Teacher ass = new AssociateProfessor("neymar", 28, "副教授", 13000);

        lecturer.introduce();
        professor.introduce();
        ass.introduce();
    }
}
