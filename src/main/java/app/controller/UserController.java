package app.controller;

import app.model.ErrorInfo;
import app.model.Settings;
import app.model.User;
import app.service.SettingsService;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * UserControllerクラス<br>
 *　ユーザー関連情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class UserController {
	
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
	public User getUserInfo(@PathVariable("userId") String userId) {
		User user = userservice.getUser(userId);
		Settings settings = settingsService.getSettings(user.getUid());
		if (settings.isUserenabled() && settings.isUservisibled()) {
			return user;
		} else {
			return new User();
		}
	}

	/**
	 * postUserInfoメソッド<br>
	 * 指定したユーザー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param user 更新するユーザー情報の内容
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/{userId}")
	public ErrorInfo postUserInfo(@PathVariable("userId") String userId, @RequestBody User user) {
		return new ErrorInfo();
	}

	/**
	 * getFollowListメソッド<br>
	 * 指定したユーザーのフォローユーザーリストを返す
	 *  @param userId urlで指定されたユーザーID
	 * @return List<User> フォローユーザーリスト
	 */
	@GetMapping("/api/user/follow/{userId}")
	public List<User> getFollowList(@PathVariable("userId") String userId) {
		return new ArrayList<User>();
	}

	/**
	 * postFollowListメソッド<br>
	 * 指定したユーザーのフォロー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param user 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/follow/{userId}")
	public ErrorInfo postFollowList(@PathVariable("userId") String userId, @RequestBody User user) {
		return new ErrorInfo();
	}

	/**
	 * getFollowerListメソッド<br>
	 * 指定したユーザーのフォロワーユーザーリストを返す
	 *  @param userId urlで指定されたユーザーID
	 * @return List<User> フォロワーユーザーリスト
	 */
	@GetMapping("/api/user/follower/{userId}")
	public List<User> getFollowerList(@PathVariable("userId") String userId) {
		return new ArrayList<User>();
	}

	/**
	 * postFollowerListメソッド<br>
	 * 指定したユーザーのフォロワー情報を更新する
	 *  @param userId urlで指定されたユーザーID
	 *  @param user 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/follower/{userId}")
	public ErrorInfo postFollowerList(@PathVariable("userId") String userId, @RequestBody User user) {
		return new ErrorInfo();
	}

	/**
	 * getTagUserListメソッド<br>
	 * 指定したタグのタグ付けユーザーリストを返す
	 *  @param tagName urlで指定されたタグ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@GetMapping("/api/tag/{tagName}")
	public List<User> getTagUserList(@PathVariable("tagName") String tagName) {
		return new ArrayList<User>();
	}

	/**
	 * getServiceUserListメソッド<br>
	 * 指定したサービスの登録ユーザーリストを返す
	 *  @param serviceName urlで指定されたサービス名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@GetMapping("/api/service/{serviceName}")
	public List<User> getServiceUserList(@PathVariable("serviceName") String serviceName) {
		return new ArrayList<User>();
	}
}