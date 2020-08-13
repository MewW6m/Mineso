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
	 * @param socialType SNS種類
	 * @return リダイレクト先
	 */
	@PostMapping("/api/auth/{socialtype}")
	public String postAuth(@PathVariable("socialType") String socialType) {
//		return "redirect:/Top";
        return "{\"code\": 0,\"message\": \"string\"}";
	}


	/**
	 * getProfileSetting<br>
	 * プロフィール設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return プロフィール設定情報
	 */
	@JsonView(JView.Profile.class)
	@GetMapping("/api/setting/profile/{uid}")
    public String getProfileSetting(@PathVariable("uid") int uid) {
//    public Settings getProfileSetting(@PathVariable("uid") int uid) {
//		return settingsService.getSettings(uid);
        return "{\"sid\": 0}";
	}

	/**
	 * postProfileSetting<br>
	 * プロフィール設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings プロフィール設定情報
	 * @return レスポンス情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.Profile.class)
	@PostMapping("/api/setting/profile/{uid}")
    public String postProfileSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Profile.class) Settings settings) throws Exception {
//    public Response postProfileSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Profile.class) Settings settings) throws Exception {
//		settingsService.postSettings(uid, settings);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * getAccountSetting<br>
	 * アカウント設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return アカウント設定情報
	 */
	@JsonView(JView.Account.class)
	@GetMapping("/api/setting/account/{uid}")
    public String getAccountSetting(@PathVariable("uid") int uid) {
//    public Settings getAccountSetting(@PathVariable("uid") int uid) {
//		return settingsService.getSettings(uid);
        return "{\"sid\": 0,\"umail\": \"string\"}";
	}

	/**
	 * postAccountSetting<br>
	 * アカウント設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings アカウント設定情報
	 * @return レスポンス情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.Account.class)
	@PostMapping("/api/setting/account/{uid}")
    public String postAccountSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Account.class) Settings settings) throws Exception {
//	public Response postAccountSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Account.class) Settings settings) throws Exception {
//		settingsService.postSettings(uid, settings);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * getNortificationSetting<br>
	 * 通知設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return 通知設定情報
	 */
	@JsonView(JView.Nortification.class)
	@GetMapping("/api/setting/nortification/{uid}")
    public String getNortificationSetting(@PathVariable("uid") int uid) {
//    public Settings getNortificationSetting(@PathVariable("uid") int uid) {
//		return settingsService.getSettings(uid);
        return "{\"sid\": 0}";
    }

	/**
	 * postNortificationSetting<br>
	 * 通知設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 通知設定情報
	 * @return レスポンス情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.Nortification.class)
	@PostMapping("/api/setting/nortification/{uid}")
    public String postNortificationSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Nortification.class) Settings settings) throws Exception {
//	public Response postNortificationSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Nortification.class) Settings settings) throws Exception {
//		settingsService.postSettings(uid, settings);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * getCustomizeSetting<br>
	 * 表示設定情報を返す
	 *  @param uid ログイン中のユーザー固有ID
	 * @return 表示設定情報
	 */
	@JsonView(JView.Customize.class)
	@GetMapping("/api/setting/customize/{uid}")
    public String getCustomizeSetting(@PathVariable("uid") int uid) {
//    public Settings getCustomizeSetting(@PathVariable("uid") int uid) {
//		return settingsService.getSettings(uid);
        return "{\"sid\": 0}";
	}

	/**
	 * postCustomizeSetting<br>
	 * 表示設定情報を更新する
	 *  @param uid ログイン中のユーザー固有ID
	 *  @param settings 表示設定情報
	 * @return レスポンス情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.Customize.class)
	@PostMapping("/api/setting/customize/{uid}")
    public String postCustomizeSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Customize.class) Settings settings) throws Exception {
//	public Response postCustomizeSetting(@PathVariable("uid") int uid, @RequestBody @JsonView(JView.Customize.class) Settings settings) throws Exception {
//		settingsService.postSettings(uid, settings);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}
}