package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
    public static void main(String[] args) {
        Human03 yamada = new Human03();

        System.out.println("私の名前は、" + yamada.name + "です。");
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        yamada.greet("田辺");
        yamada.greet(null);
    }
}