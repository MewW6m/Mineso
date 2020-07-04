package app.controller;

import app.config.JView;
import app.model.ErrorInfo;
import app.model.Settings;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

/**
 * SettingsController<br>
 * 設定情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class SettingController {

	/**
	 * getProfileSettingメソッド<br>
	 * プロフィール設定情報を返す
	 *  @param uId ログイン中のユーザー固有ID
	 * @return Settings プロフィール設定情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/{uId}")
    public Settings getProfileSetting(@PathVariable("uId") String uId) {
		return new Settings();
	}

	/**
	 * postProfileSettingメソッド<br>
	 * プロフィール設定情報を更新する
	 *  @param uId ログイン中のユーザー固有ID
	 *  @param settings プロフィール設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Profile.class)
	@PostMapping("/api/setting/profile/{uId}")
	public ErrorInfo postProfileSetting(@PathVariable("uId") String uId, @RequestBody Settings settings) {
		return new ErrorInfo();
	}

	/**
	 * getAccountSettingメソッド<br>
	 * アカウント設定情報を返す
	 *  @param uId ログイン中のユーザー固有ID
	 * @return Settings アカウント設定情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/{uId}")
    public Settings getAccountSetting(@PathVariable("uId") String uId) {
		return new Settings();
	}

	/**
	 * postAccountSettingメソッド<br>
	 * アカウント設定情報を更新する
	 *  @param uId ログイン中のユーザー固有ID
	 *  @param settings アカウント設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Account.class)
	@PostMapping("/api/setting/account/{uId}")
	public ErrorInfo postAccountSetting(@PathVariable("uId") String uId, @RequestBody Settings settings) {
		return new ErrorInfo();
	}

	/**
	 * getNortificationSettingメソッド<br>
	 * 通知設定情報を返す
	 *  @param uId ログイン中のユーザー固有ID
	 * @return Settings 通知設定情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/notification/{uId}")
    public Settings getNortificationSetting(@PathVariable("uId") String uId) {
		return new Settings();
	}

	/**
	 * postNortificationSettingメソッド<br>
	 * 通知設定情報を更新する
	 *  @param uId ログイン中のユーザー固有ID
	 *  @param settings 通知設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Nortification.class)
	@PostMapping("/api/setting/notification/{uId}")
	public ErrorInfo postNortificationSetting(@PathVariable("uId") String uId, @RequestBody Settings settings) {
		return new ErrorInfo();
	}

	/**
	 * getCustomizeSettingメソッド<br>
	 * 表示設定情報を返す
	 *  @param uId ログイン中のユーザー固有ID
	 * @return Settings 表示設定情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/{uId}")
    public Settings getCustomizeSetting(@PathVariable("uId") String uId) {
		return new Settings();
	}

	/**
	 * postCustomizeSettingメソッド<br>
	 * 表示設定情報を更新する
	 *  @param uId ログイン中のユーザー固有ID
	 *  @param settings 表示設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Customize.class)
	@PostMapping("/api/setting/customize/{uId}")
	public ErrorInfo postCustomizeSetting(@PathVariable("uId") String uId, @RequestBody Settings settings) {
		return new ErrorInfo();
	}
}