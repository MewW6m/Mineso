package app.controller;

import app.config.JView;
import app.model.Response;
import app.model.Settings;
import app.service.SettingsService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * SettingsController<br>
 * 設定情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class SettingRestController {

	@Autowired
	private SettingsService settingsService;
	
	/**
	 * postAuth
	 * ログインする。SpringSecurityの方で実装予定。(本メソッドは削除予定)
	 * @return String リダイレクト先
	 */
	@PostMapping("/api/auth/{socialtype}")
	public String postAuth(@PathVariable("socialType") String socialType) {
		return "redirect:/Top";
	}


	/**
	 * getProfileSetting<br>
	 * プロフィール設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings プロフィール設定情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/{uid}")
    public Settings getProfileSetting(@PathVariable("uid") int uid) {
		return settingsService.getSettings(uid);
	}

	/**
	 * postProfileSetting<br>
	 * プロフィール設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings プロフィール設定情報
	 * @return Response レスポンス情報
	 */
	@JsonView(JView.Profile.class)
	@PostMapping("/api/setting/profile/{uid}")
	public Response postProfileSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Profile.class) Settings settings) throws Exception {
		settingsService.postSettings(uid, settings);
		return new Response();
	}

	/**
	 * getAccountSetting<br>
	 * アカウント設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings アカウント設定情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/{uid}")
    public Settings getAccountSetting(@PathVariable("uid") int uid) {
		return settingsService.getSettings(uid);
	}

	/**
	 * postAccountSetting<br>
	 * アカウント設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings アカウント設定情報
	 * @return Response レスポンス情報
	 */
	@JsonView(JView.Account.class)
	@PostMapping("/api/setting/account/{uid}")
	public Response postAccountSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Account.class) Settings settings) throws Exception {
		settingsService.postSettings(uid, settings);
		return new Response();
	}

	/**
	 * getNortificationSetting<br>
	 * 通知設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings 通知設定情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/nortification/{uid}")
    public Settings getNortificationSetting(@PathVariable("uid") int uid) {
		return settingsService.getSettings(uid);
	}

	/**
	 * postNortificationSetting<br>
	 * 通知設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 通知設定情報
	 * @return Response レスポンス情報
	 */
	@JsonView(JView.Nortification.class)
	@PostMapping("/api/setting/nortification/{uid}")
	public Response postNortificationSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Nortification.class) Settings settings) throws Exception {
		settingsService.postSettings(uid, settings);
		return new Response();
	}

	/**
	 * getCustomizeSetting<br>
	 * 表示設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return Settings 表示設定情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/{uid}")
    public Settings getCustomizeSetting(@PathVariable("uid") int uid) {
		return settingsService.getSettings(uid);
	}

	/**
	 * postCustomizeSetting<br>
	 * 表示設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 表示設定情報
	 * @return Response レスポンス情報
	 */
	@JsonView(JView.Customize.class)
	@PostMapping("/api/setting/customize/{uid}")
	public Response postCustomizeSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Customize.class) Settings settings) throws Exception {
		settingsService.postSettings(uid, settings);
		return new Response();
	}
}