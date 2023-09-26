package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exception02 {
	public static void main(String[] args) {
		// try-catch-finally文の開始
		try {
			// tryブロック：例外が発生する可能性がある処理を記述
			String allData = Files.readString(Paths.get("c:\\temp\\memo.txt"));
			System.out.println(allData);
			// IOExceptionが発生した場合の例外処理
		} catch (IOException e) {
			// 例外クラスが一致するので、例外処理が実行される
			System.out.println("例外が発生");
		} finally {
			// 例外発生しても、しなくても、処理を実行
			System.out.println("プログラム終了");
		}
	}

}
