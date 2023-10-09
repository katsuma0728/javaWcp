package classmethod.human;

public class Human04 {
	// メンバー変数
	// static変数
	static public int humanCount = 0;
	// インスタンス変数
	public String name;
	// 定数
	public static final String GREETING = "こんにちは";

	public Human04(String name) {
		this.name = name;
		// インスタンスを生成ごとにstatic変数をインクリメント
		Human04.humanCount++;
	}

	static public void staticMethodPrint() {
		// staticメゾッドからインスタンス変数は使用できない（コンパイルエラー）
		// System.out.println("名前は、" + name);
		// static変数のhumanCountを表示
		System.out.println("人の人数は" + Human04.humanCount);
	}

	public void instanceMethodPrint() {
		// インスタンス変数のnameを表示
		System.out.println("名前は" + name);
	}
}
