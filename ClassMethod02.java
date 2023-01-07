// パッケージ宣言
package classMethod;

// インポート文
import classMethod.human.Human02;

public class ClassMethod02 {
    public static void main(String[] args) {
        Human02 yamada = new Human02();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human02 sato = new Human02("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}