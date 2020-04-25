package app.main.domain;

import lombok.Data;

// 設定情報クラス
@Data
public class SettingsDomain{
	private int SettingId;
	private int uId;
	private boolean userEnabled;
	private boolean userVisibled;
	private String designSettings;
}