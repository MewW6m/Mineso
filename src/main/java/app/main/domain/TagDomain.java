package app.main.domain;

import lombok.Data;

// タグ情報クラス
@Data
public class TagDomain{
	private int tId;
	private int tName;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public int gettName() {
		return tName;
	}
	public void settName(int tName) {
		this.tName = tName;
	}
}