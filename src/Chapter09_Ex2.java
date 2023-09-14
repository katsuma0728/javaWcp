
public class Chapter09_Ex2 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b) + "です");
	}
	
//	ユーグリッドの互除法で最大公約数を計算するメゾッド
	static int gcd(int a, int b) {
//		b(余りが)0になった時のaが最大公約数
		if (b == 0) {
			return a;
		}
//		再帰呼び出し
		return gcd(b, a % b);
	}
}
