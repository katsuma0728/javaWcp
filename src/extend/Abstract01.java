package extend;

import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {

		// Dogクラスのインスタンスを生成
		Dog dog = new Dog();
		// Animalクラスのメゾッドを呼び出し
		dog.eat();
		// 抽象メゾットを実装したメゾッドを呼び出し
		dog.cry();

		// 抽象クラスはインスタンス生成するとコンパイルエラー
		// Animal animal = new Animal();
	}

}
