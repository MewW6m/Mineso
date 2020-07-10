package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Settings;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

/**
 * SettingsController<br>
 * 設定情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class SettingRestController {

	/**
	 * postAuthメソッド<br>
	 * ログインする。SpringSecurityの方で実装予定。(本メソッドは削除予定)
	 * @return String リダイレクト先
	 */
	@PostMapping("/api/auth/{socialType}")
	public String postAuth(@PathVariable("socialType") String socialType) {
		return "redirect:/Top";
	}


	/**
	 * getProfileSettingメソッド<br>
	 * プロフィール設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings プロフィール設定情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/{uid}")
    public Settings getProfileSetting(@PathVariable("uid") String uid) {
		Settings settings = new Settings();
		settings.setSid(1);
		settings.setProfilesetting1("prof");
		return settings;
	}

	/**
	 * postProfileSettingメソッド<br>
	 * プロフィール設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings プロフィール設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Profile.class)
	@PostMapping("/api/setting/profile/{uid}")
	public ErrorInfos postProfileSetting(@PathVariable("uid") String uid, @RequestBody Settings settings) {
		return new ErrorInfos();
	}

	/**
	 * getAccountSettingメソッド<br>
	 * アカウント設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings アカウント設定情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/{uid}")
    public Settings getAccountSetting(@PathVariable("uid") String uid) {
		Settings settings = new Settings();
		settings.setSid(1);
		settings.setAccountsetting1("acc");
		return settings;
	}

	/**
	 * postAccountSettingメソッド<br>
	 * アカウント設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings アカウント設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Account.class)
	@PostMapping("/api/setting/account/{uid}")
	public ErrorInfos postAccountSetting(@PathVariable("uid") String uid, @RequestBody Settings settings) {
		return new ErrorInfos();
	}

	/**
	 * getNortificationSettingメソッド<br>
	 * 通知設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings 通知設定情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/nortification/{uid}")
    public Settings getNortificationSetting(@PathVariable("uid") String uid) {
		Settings settings = new Settings();
		settings.setSid(1);
		settings.setNorsetting1("nor");
		return settings;
	}

	/**
	 * postNortificationSettingメソッド<br>
	 * 通知設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 通知設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Nortification.class)
	@PostMapping("/api/setting/nortification/{uid}")
	public ErrorInfos postNortificationSetting(@PathVariable("uid") String uid, @RequestBody Settings settings) {
		return new ErrorInfos();
	}

	/**
	 * getCustomizeSettingメソッド<br>
	 * 表示設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings 表示設定情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/{uid}")
    public Settings getCustomizeSetting(@PathVariable("uid") String uid) {
		Settings settings = new Settings();
		settings.setSid(1);
		settings.setCustomizesetting1("cus");
		return settings;
	}

	/**
	 * postCustomizeSettingメソッド<br>
	 * 表示設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 表示設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Customize.class)
	@PostMapping("/api/setting/customize/{uid}")
	public ErrorInfos postCustomizeSetting(@PathVariable("uid") String uid, @RequestBody Settings settings) {
		return new ErrorInfos();
	}
}