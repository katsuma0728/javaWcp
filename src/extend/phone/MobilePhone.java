package extend.phone;

//Phone, Cameraインターフェイスを実装したMobilePhoneクラスの宣言
public class MobilePhone implements Phone, Camera {
	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}

//	Cameraインターフェイスのメゾッドを実装
	public void takePicture() {
		System.out.println("写真をとります。");
	}

//	Phoneインターフェイスのメゾッドを実装
	public void call(String number) {
		System.out.println(this.number + "から" + number + "に電話をかけます。");
	}
}
