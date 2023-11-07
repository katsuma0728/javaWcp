package capsule.human;

public class HumanCapsule {
	// privateのアクセス修飾子を設定して外部から隠蔽
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// nameのgetterメゾッド
	// nameは外部から変更禁止なので、setterメゾッドは作成しない
	public String getName() {
		return name;
	}

	// ageのgetterメゾッド
	// ageは外部から変更禁止なので、setterメゾッドは作成しない
	public int getAge() {
		return age;
	}
}
