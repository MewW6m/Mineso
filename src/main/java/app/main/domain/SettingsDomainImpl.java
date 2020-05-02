package app.main.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * SettingsDomainImplクラス<br>
 *　設定情報ドメイン実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SettingsDomainImpl extends SettingsDomainIF{
	private int SettingId;
	private int uId;
	private boolean userEnabled;
	private boolean userVisibled;
	private String designSettings;
}