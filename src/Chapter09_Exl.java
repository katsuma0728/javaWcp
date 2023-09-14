
public class Chapter09_Exl {
	public static void main(String[] args) {
//		ループ処理で、九九の左辺の数値を決定
		for (int i = 1; i < 10; i++) {
//			ループ処理で、九九の右辺の数値を決定
			for (int j = 1; j < 10; j++) {
//				左辺と右辺の掛け算を実施。改行なし(System.out.print)で出力
				System.out.print(i + "*" + j + "=" + i * j + "");
			}
//			九九の1段ごとに、改行
			System.out.println();
		}
	}
}
