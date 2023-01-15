package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism01 {
    public static void main(String[] args) {
        Human human1 = new Student("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());

        Human human2 = new Employee("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human2.getProfile());
    }
}