package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Users;
import app.service.SettingsService;
import app.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
	 * getUserInfo<br>
	 * 指定したユーザー情報を返す
	 *  @param userid urlで指定されたユーザーID
	 * @return User 指定されたユーザー情報
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/{userid}")
	public Users getUserInfo(@PathVariable("userid") String userid) throws Exception {
		return userservice.getUser(userid, true);
	}

	/**
	 * postUserInfo<br>
	 * 指定したユーザー情報を更新する
	 *  @param userid urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報の内容
	 *  @param error 検証結果
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/{userid}")
	public ErrorInfos postUserInfo(@RequestBody @JsonView(JView.UserInfo.class) Users users,
								   BindingResult error) throws Exception {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.postUser(users, myUid);
		return new ErrorInfos();
	}

	/**
	 * getFollowList<br>
	 * 指定したユーザーのフォローユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return List<User> フォローユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/follow/{userid}")
	public List<Users> getFollowList(@PathVariable("userid") String userid) throws Exception  {
		return userservice.getFollow(userid);
	}

	/**
	 * addFollow<br>
	 * 指定したユーザーをフォローする
	 *  @param targetUid 更新するユーザー固有ID
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/follow/add/{targetUid}")
	public ErrorInfos addFollow(@RequestParam Integer targetUid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.insertFollow(targetUid, myUid);
		return new ErrorInfos();
	}

	/**
	 * addFollow<br>
	 * 指定したユーザーをフォローする
	 *  @param targetUid 更新するユーザー固有ID
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/follow/del/{targetUid}")
	public ErrorInfos delFollow(@RequestParam Integer targetUid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.deleteFollow(targetUid, myUid);
		return new ErrorInfos();
	}

	/**
	 * getFollowerList<br>
	 * 指定したユーザーのフォロワーユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return List<User> フォロワーユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/follower/{userid}")
	public List<Users> getFollowerList(@PathVariable("userid") String userid) throws Exception  {
		return userservice.getFollower(userid);
	}

//	/**
//	 * postFollower<br>
//	 * 指定したユーザーのフォロワー情報を更新する
//	 *  @param targetUid 更新するユーザー固有ID
//	 *  @param cdFlg 更新フラグ(0:追加/1:削除)
//	 * @return ErrorInfo エラー情報
//	 */
//	@PostMapping("/api/user/follower/{userid}")
//	public ErrorInfos postFollower(@RequestBody Integer targetUid, @RequestBody Boolean cdFlg) {
//		Integer myUid = 1;
//		if(!cdFlg)
//			userservice.addFollower(targetUid, myUid);
//		else
//			userservice.delFollower(targetUid, myUid);
//			return new ErrorInfos();
//	}

	/**
	 * getTagUserList<br>
	 * 指定したタグのタグ付けユーザーリストを返す
	 *  @param tagName urlで指定されたタグ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/tag/{tagName}")
	public List<Users> getTagUserList(@PathVariable("tagName") String tagName) {
		Users user = new Users();
		List<Users> userList = new ArrayList<Users>();
		user.setUserid("ac01");
		user.setUname("user01");
		user.setUmail("mailaddress");
		user.setUdesc("desc");
		user.setUimgpath("/path");
		userList.add(user);
		userList.add(user);
		return userList;
	}

	/**
	 * getAppUserList<br>
	 * 指定したアプリの登録ユーザーリストを返す
	 *  @param aname urlで指定されたアプリ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/app/{aname}")
	public List<Users> getAppUserList(@PathVariable("aname") String aname) {
		Users user = new Users();
		List<Users> userList = new ArrayList<Users>();
		user.setUserid("ac01");
		user.setUname("user01");
		user.setUmail("mailaddress");
		user.setUdesc("desc");
		user.setUimgpath("/path");
		userList.add(user);
		userList.add(user);
		return userList;
	}
}