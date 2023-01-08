// パッケージ宣言
package classMethod;

// インポート文
import classMethod.human.Human05;

public class ClassMethod05 {
    public static void main(String[] args) {
        Human05 yamada = new Human05();  

        //nameとageはprivateな変数なので直接参照はできない
        //System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        //nameとageそれぞれの値を返すpublicなメソッドを通して参照し出力することはできる
        System.out.println("名前は" + yamada.getName() + "で、年齢は" + yamada.getAge() + "です。");
    }
}