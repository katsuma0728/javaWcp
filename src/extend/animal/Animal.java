package extend.animal;

// abstract修飾子を設定して、抽象クラスとして宣言
public abstract class Animal {
	protected String name;

	// 共通メゾッドを記述
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

	// サブクラスごとに違う処理は、抽象メゾットにしてサブクラスに実装される
	public abstract void cry();
}
