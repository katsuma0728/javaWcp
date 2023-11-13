package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	// Humanクラスのインスタンスを生成
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメゾッド：名前は、" + sugimoto.getName());

		// Studentクラスのインスタンスを生成
		Student sato = new Student("佐藤", 17, 70);
		// サブクラスのインスタンスからスーパークラス（Humanクラス）のメゾッドを呼び出し
		System.out.println("Humanクラスのメゾッド：名前は、" + sato.getName());
		// Studentクラスに追加したgetStudentProfileメゾッドを呼び出し
		System.out.println("Studentクラスのメゾッド：プロフィールを紹介します。" + sato.getStudentProfile());

		// Employeeクラスのインスタンスを生成して、アップキャスト（※）でHumanクラスの変数に代入
		Human human = new Employee("田中", 28, "システム部");
		// スーパークラス（Humanクラス）のメゾッドを呼び出し
		System.out.println("Humanクラスのメゾッド：名前は、" + human.getName());
		// Humanクラスには、getEmployeeProfileメゾットがないのでアクセスするとコンパイルエラー
		// System.out.println("Employeeクラスのメゾッド；" + human.getEmployeeProfile());
		// Employeeクラスの変数にダウンキャスト（※）
		Employee tanaka = (Employee) human;
		// Employeeクラスの変数あので、Employeeクラスに追加したgetEmployeeProfileメゾットの呼び出しができる
		System.out.println("Employeeクラスのメゾッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		// printlnNameメゾットを呼び出して、名前を表示
		Extend01.printName(sugimoto);
		// Humanクラスのサブクラスの変数を引数にして呼び出し
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	// 引数がHumanクラスなので、Humanクラスか、サブクラスなら呼び出しができる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメゾッド；名前は、" + human.getName());
	}

}
