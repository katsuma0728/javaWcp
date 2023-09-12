package javaWcp;

public class Chapter06 {
	public static void main(String[] args) {
//		プリミティブ型の「long」の変数の値(1000000000)を代入敷いて出力
		long l = 10000000000L;
		System.out.println(l);
//		プリミティブ型の「double」の変数に値(3.14)を代入して出力
		double d = 3.14d;
		System.out.println(d);
//		プリミティブ型の「boolean」の変数(true)に値を代入して出力
		boolean b = true;
		System.out.println(b);
		
//		ラッパークラスの「Integer」の変数に値(100)を代入して出力
		Integer i = 100;
		System.out.println(i);
//		ラッパークラスの「Float」の変数に値(1.4142)を代入して出力
		Float f = 1.4142f;
		System.out.println(f);
//		ラッパークラスの「Character」の変数に値('う')を代入して出力
		Character c = 'う';
		System.out.println(c);
		
//		要素数が５の「int」配列に値({ 0, 10, 20, 30, 40})を代入して、インデックス番号が3の値を出力
		int[] array = { 0, 10, 20, 30, 40 };
		System.out.println(array[3]);
	}
}
