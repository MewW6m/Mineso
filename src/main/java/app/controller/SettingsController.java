package app.controller;

import app.config.JView;
import app.model.ErrorInfo;
import app.model.Settings;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public Settings getProfileSetting(@PathVariable("userId") String userId) {
		return new Settings();
	}

	/**
	 * postProfileSettingメソッド<br>
	 * プロフィール設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param settings プロフィール設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/@{userId}")
	public ErrorInfo postProfileSetting(@PathVariable("userId") String userId, @RequestBody Settings settings) {
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
    public Settings getAccountSetting(@PathVariable("userId") String userId) {
		return new Settings();
	}

	/**
	 * postAccountSettingメソッド<br>
	 * アカウント設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param settings アカウント設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/@{userId}")
	public ErrorInfo postAccountSetting(@PathVariable("userId") String userId, @RequestBody Settings settings) {
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
    public Settings getNortificationSetting(@PathVariable("userId") String userId) {
		return new Settings();
	}

	/**
	 * postNortificationSettingメソッド<br>
	 * 通知設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param settings 通知設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/notification/@{userId}")
	public ErrorInfo postNortificationSetting(@PathVariable("userId") String userId, @RequestBody Settings settings) {
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
    public Settings getCustomizeSetting(@PathVariable("userId") String userId) {
		return new Settings();
	}

	/**
	 * postCustomizeSettingメソッド<br>
	 * 表示設定情報を更新する
	 *  @param userId ユーザーID
	 *  @param settings 表示設定情報
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/@{userId}")
	public ErrorInfo postCustomizeSetting(@PathVariable("userId") String userId, @RequestBody Settings settings) {
		return new ErrorInfo();
	}
}