package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Users;
import app.service.TagService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * TagRestController<br>
 *　タグ関連情報を操作するコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class TagRestController {

    @Autowired
    private TagService tagService;

    /**
     * registTagname<br>
     * タグを登録する
     * @param tagName タグ名
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/tag/{tagname}")
    public ErrorInfos registTagname(@PathVariable("tagname") String tagName){
        Integer myUid = 1;
        tagService.insertTagname(tagName, myUid);
        return new ErrorInfos();
    }

    /**
     * addUserToTagname<br>
     * タグにユーザーを追加する
     * @param tagName タグ名
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/usertag/{tagname}")
    public ErrorInfos addUserToTagname(@PathVariable("tagname") String tagName){
        Integer myUid = 1;
        tagService.insertUserTag(tagName, myUid);
        return new ErrorInfos();
    }


    /**
     * getTagUserList<br>
     * 指定したタグのタグ付けユーザーリストを返す
     *  @param tagname タグ名
     * @return List<User> タグ付けユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/tag/{tagname}")
    public List<Users> getTagUserList(@PathVariable("tagname") String tagname) {
        /*Users user = new Users();
        List<Users> userList = new ArrayList<Users>();
        user.setUserid("ac01");
        user.setUname("user01");
        user.setUmail("mailaddress");
        user.setUdesc("desc");
        user.setUimgpath("/path");
        userList.add(user);
        userList.add(user);
        return userList;*/
        return tagService.selectTagList(tagname);
    }
}
