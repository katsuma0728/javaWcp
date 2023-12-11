package extend.phone;

//Phoneインターフェイスの宣言
public interface Phone {
//	フィールドの宣言
	final int MAX_NUMBER_DIGITS = 11;

//	public abstractが自動で追加される（抽象メゾッド）
	void call(String number);

	// defaultメゾッドの宣言
	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}
