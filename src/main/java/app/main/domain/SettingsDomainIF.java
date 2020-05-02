package app.main.domain;

import lombok.Data;

/**
 * SettingsDomainIFインターフェース<br>
 *　設定情報ドメインインターフェース<br>
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
public  abstract class SettingsDomainIF{
	protected int SettingId;
	protected int uId;
	protected boolean userEnabled;
	protected boolean userVisibled;
	protected String designSettings;
}