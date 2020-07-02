package app.controller;

import app.config.JView;
import app.model.ErrorInfo;
import app.model.Setting;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

/**
 * SettingsController<br>
 * 設定情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class SettingsController {

	/**
	 * getProfileSettingメソッド<br>
	 * プロフィール設定情報を返す
	 *  @param userId ユーザーID
	 * @return Settings プロフィール設定情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/@{userId}")
    public Setting getProfileSetting(@PathVariable("userId") String userId) {
		return new Setting();
	}

	/**
	 * postProfileSettingメソッド<br>
	 * プロフィール設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param setting プロフィール設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/@{userId}")
	public ErrorInfo postProfileSetting(@PathVariable("userId") String userId, @RequestBody Setting setting) {
		return new ErrorInfo();
	}

	/**
	 * getAccountSettingメソッド<br>
	 * アカウント設定情報を返す
	 *  @param userId ユーザーID
	 * @return Settings アカウント設定情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/@{userId}")
    public Setting getAccountSetting(@PathVariable("userId") String userId) {
		return new Setting();
	}

	/**
	 * postAccountSettingメソッド<br>
	 * アカウント設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param setting アカウント設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/@{userId}")
	public ErrorInfo postAccountSetting(@PathVariable("userId") String userId, @RequestBody Setting setting) {
		return new ErrorInfo();
	}

	/**
	 * getNortificationSettingメソッド<br>
	 * 通知設定情報を返す
	 *  @param userId ユーザーID
	 * @return Settings 通知設定情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/notification/@{userId}")
    public Setting getNortificationSetting(@PathVariable("userId") String userId) {
		return new Setting();
	}

	/**
	 * postNortificationSettingメソッド<br>
	 * 通知設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param setting 通知設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/notification/@{userId}")
	public ErrorInfo postNortificationSetting(@PathVariable("userId") String userId, @RequestBody Setting setting) {
		return new ErrorInfo();
	}

	/**
	 * getCustomizeSettingメソッド<br>
	 * 表示設定情報を返す
	 *  @param userId ユーザーID
	 * @return Settings 表示設定情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/@{userId}")
    public Setting getCustomizeSetting(@PathVariable("userId") String userId) {
		return new Setting();
	}

	/**
	 * postCustomizeSettingメソッド<br>
	 * 表示設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param setting 表示設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/@{userId}")
	public ErrorInfo postCustomizeSetting(@PathVariable("userId") String userId, @RequestBody Setting setting) {
		return new ErrorInfo();
	}
}