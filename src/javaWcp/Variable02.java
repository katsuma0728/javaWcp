package javaWcp;

public class Variable02 {
	// [1]static final定数の宣言
	static final int MIN_NUMBER = 10;

	public static void main(String[] args) {
		System.out.println(MIN_NUMBER);
		// [1]を代入しようとするとエラー
		// MIN_NUMBER = 20;

		// [2]final定数の宣言
		final int maxValue;
		// [2]一度は値を設定できる
		maxValue = 100;
		System.out.println(maxValue);
		// [2]再代入しようとするとエラー
		// maxValue = 200;
	}

}
