package practice;

public class CapsuleTask {
	// メンバー変数のアクセス修飾子を[private]に変更して隠蔽化
	private String content;
	private int date;
	private String status;

	public CapsuleTask(String content, int date) {
		this.content = content;
		this.date = date;
		this.status = "未完了";
	}

	// contentのgetter
	public String getContent() {
		return content;
	}

	// dateのgetter
	public int getDate() {
		return date;
	}

	
	// statusのgetter
	public String getStatus() {
		return status;
	}

	
	// statusのsetter
	public void setStatus(String status) {
		this.status = status;
	}
}
