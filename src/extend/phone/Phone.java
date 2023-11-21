package extend.phone;

//Phoneインターフェイスの宣言
public interface Phone {
//	フィールドの宣言
	int MAX_NUMBER_DIGITS = 11;

//	public abstractが自動で追加される（抽象メゾッド）
	void call(String number);
}
