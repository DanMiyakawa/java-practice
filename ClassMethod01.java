    public class Human01 {
    public String name; //メンバー変数
    public int age;  //メンバー変数

    //引数なしのコンストラクタ
    public Human01() {
        name = "山田";
        age = 20;
    }
    //引数2つのコンストラクタ
    public Human01(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 yamada = new Human01(); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human01 sato = new Human01("佐藤", 25); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}