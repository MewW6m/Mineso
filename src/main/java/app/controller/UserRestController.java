package app.controller;

import app.config.JView;
import app.model.Response;
import app.model.Users;
import app.service.SettingsService;
import app.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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
	 * getUserInfo<br>
	 * 指定したユーザー情報を返す
	 *  @param userid urlで指定されたユーザーID
	 * @return 指定されたユーザー情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.UserDetail.class)
	@GetMapping("/api/user/@{userid}")
//    public String getUserInfo(@PathVariable("userid") String userid) throws Exception {
  	public Users getUserInfo(@PathVariable("userid") String userid) throws Exception {
		return userservice.getUser(userid, true);
//        return "{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\",\"followcount\": 0,\"followercount\": 0,\"taglist\": [{\"tid\": 0,\"tname\": \"string\"}],\"applist\": [{\"aid\": 0,\"aname\": \"string\",\"aimgpath\": \"string\",\"aurl\": \"string\"}]}";
	}

	/**
	 * postUserInfo<br>
	 * 指定したユーザー情報を更新する
	 *  @param users 更新するユーザー情報の内容
	 *  @param error 検証結果
	 * @return レスポンス情報
	 * @throws Exception 例外
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/@{userid}")
    public String postUserInfo(@RequestBody @JsonView(JView.UserInfo.class) Users users,
//    public Response postUserInfo(@RequestBody @JsonView(JView.UserInfo.class) Users users,
								 BindingResult error) throws Exception {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
//		Integer myUid = 1;
//		userservice.postUser(users, myUid);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * delUserInfo<br>
	 * 指定したユーザー情報を削除する
	 * @return 結果
	 * @throws Exception 例外
	 */
	@JsonView(JView.Public.class)
	@DeleteMapping("/api/user/@{userid}")
    public String delUserInfo() throws Exception {
//    public Response delUserInfo() throws Exception {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
//		Integer myUid = 1;
//		userservice.postUser(users, myUid);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }

	/**
	 * getFollowList<br>
	 * 指定したユーザーのフォローユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return フォローユーザーリスト
	 * @throws Exception 例外
	 */
	@JsonView(JView.follow.class)
	@GetMapping("/api/user/follow/@{userid}")
    public String getFollowList(@PathVariable("userid") String userid) throws Exception  {
//    public List<Users> getFollowList(@PathVariable("userid") String userid) throws Exception  {
//		return userservice.getFollow(userid);
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
	}

	/**
	 * addFollow<br>
	 * 指定したユーザーをフォローする
	 *  @param followuid 更新するユーザー固有ID
	 * @return レスポンス情報
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/follow/{followuid}")
    public String addFollow(@RequestParam Integer followuid) {
//    public Response addFollow(@RequestParam Integer followuid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
//		Integer myUid = 1;
//		userservice.insertFollow(followuid, myUid);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * delFollow<br>
	 * 指定したユーザーをフォロー解除する
	 *  @param followuid 更新するユーザー固有ID
	 * @return レスポンス情報
	 */
	@JsonView(JView.Public.class)
	@DeleteMapping("/api/user/follow/{followuid}")
    public String delFollow(@RequestParam Integer followuid) {
//    public Response delFollow(@RequestParam Integer followuid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
//		Integer myUid = 1;
//		userservice.deleteFollow(followuid, myUid);
//		return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
	}

	/**
	 * getFollowerList<br>
	 * 指定したユーザーのフォロワーユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return フォロワーユーザーリスト
	 * @throws Exception 例外
	 */
	@JsonView(JView.follower.class)
	@GetMapping("/api/user/follower/@{userid}")
    public String getFollowerList(@PathVariable("userid") String userid) throws Exception  {
//	public List<Users> getFollowerList(@PathVariable("userid") String userid) throws Exception  {
//		return userservice.getFollower(userid);
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
	}
}