package extend.phone;

public class MobilePhone implements Phone, Camera {
    private String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void takePicture() {
        System.out.println("写真をとります。");
    }

    public void call(String number) {
        System.out.println(this.number + " から " + number + " に電話をかけます。");
    }
}