package app.controller;

import app.model.ErrorInfos;
import app.model.Settings;
import app.model.Users;
import app.service.SettingsService;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * UserControllerクラス<br>
 *　ユーザー関連情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class UserRestController {
	
	@Autowired
	private UserService userservice;

	@Autowired
	private SettingsService settingsService;

	/**
	 * getUserInfoメソッド<br>
	 * 指定したユーザー情報を返す
	 *  @param userId urlで指定されたユーザーID
	 * @return User 指定されたユーザー情報
	 */
	@GetMapping("/api/user/{userId}")
	public Users getUserInfo(@PathVariable("userId") String userId) {
//		Users users = userservice.getUser(userId);
//		Settings settings = settingsService.getSettings(users.getUid());
//		if (users.isUdisabled() && settings.isUservisibled()) {
//			return users;
//		} else {
//			return new Users();
//		}
		// Users user = new Users(1, "user01", "user01", "e-mail@mail.com", "desc", "/img/path", false);
		Users user = new Users();
		return user;
	}

	/**
	 * postUserInfoメソッド<br>
	 * 指定したユーザー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報の内容
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/{userId}")
	public ErrorInfos postUserInfo(@PathVariable("userId") String userId, @RequestBody Users users) {
		return new ErrorInfos();
	}

	/**
	 * getFollowListメソッド<br>
	 * 指定したユーザーのフォローユーザーリストを返す
	 *  @param userId urlで指定されたユーザーID
	 * @return List<User> フォローユーザーリスト
	 */
	@GetMapping("/api/user/follow/{userId}")
	public List<Users> getFollowList(@PathVariable("userId") String userId) {
		return new ArrayList<Users>();
	}

	/**
	 * postFollowListメソッド<br>
	 * 指定したユーザーのフォロー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/follow/{userId}")
	public ErrorInfos postFollowList(@PathVariable("userId") String userId, @RequestBody Users users) {
		return new ErrorInfos();
	}

	/**
	 * getFollowerListメソッド<br>
	 * 指定したユーザーのフォロワーユーザーリストを返す
	 *  @param userId urlで指定されたユーザーID
	 * @return List<User> フォロワーユーザーリスト
	 */
	@GetMapping("/api/user/follower/{userId}")
	public List<Users> getFollowerList(@PathVariable("userId") String userId) {
		return new ArrayList<Users>();
	}

	/**
	 * postFollowerListメソッド<br>
	 * 指定したユーザーのフォロワー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/follower/{userId}")
	public ErrorInfos postFollowerList(@PathVariable("userId") String userId, @RequestBody Users users) {
		return new ErrorInfos();
	}

	/**
	 * getTagUserListメソッド<br>
	 * 指定したタグのタグ付けユーザーリストを返す
	 *  @param tagName urlで指定されたタグ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@GetMapping("/api/tag/{tagName}")
	public List<Users> getTagUserList(@PathVariable("tagName") String tagName) {
		return new ArrayList<Users>();
	}

	/**
	 * getAppUserListメソッド<br>
	 * 指定したアプリの登録ユーザーリストを返す
	 *  @param appName urlで指定されたアプリ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@GetMapping("/api/app/{appName}")
	public List<Users> getAppUserList(@PathVariable("appName") String appName) {
		return new ArrayList<Users>();
	}
}