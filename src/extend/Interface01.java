package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
//		MobilePhoneインスタンスを生成
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

//		Phoneインターフェイスのフィールド（定数）を参照
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
//		Phoneインターフェイスの抽象メゾッドを実装したメゾッドを呼び出し
		mobilePhone.call("99-8888-7777");
//		classTakePictureメゾットの呼び出し
		Interface01.classTakePicture(mobilePhone);
	}

//	Cameraインターフェイス実装したクラスを引数に渡せる
	public static void classTakePicture(Camera camera) {
//		アップキャストされた変数のメゾッドを呼び出し
		camera.takePicture();
	}

}
