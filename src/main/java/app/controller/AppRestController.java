package app.controller;

import app.config.JView;
import app.model.Users;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * AppRestController<br>
 *　アプリ関連情報を操作するコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class AppRestController {

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
