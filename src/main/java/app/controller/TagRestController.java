package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Tags;
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
     * getTagList<br>
     * タグリストを取得する
     * @return
     */
    @JsonView(JView.TagInfo.class)
    @GetMapping("/api/tag")
    public List<Tags> getTagList(){
        return tagService.selectTagList();
    }

    /**
     * getTagUserList<br>
     * 指定したタグのタグ付けユーザーリストを返す
     *  @param tagname タグ名
     * @return List<User> タグ付けユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/tag/get/{tagname}")
    public List<Users> getTagUserList(@PathVariable("tagname") String tagname) {
        return tagService.selectUserListByTags(tagname);
    }

    /**
     * registUserTag<br>
     * ユーザータグを登録する
     * @param tagName タグ名
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/tag/add/{tagname}")
    public ErrorInfos registUserTag(@PathVariable("tagname") String tagName) {
        Integer myUid = 1;
        tagService.insertUserTag(tagName, myUid);
        return new ErrorInfos();
    }

    /**
     * deleteUserTag<br>
     * ユーザータグを削除する
     * @param tagName
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/tag/del/{tagname}")
    public ErrorInfos removeUserTag(@PathVariable("tagname") String tagName) {
        Integer myUid = 1;
        tagService.deleteUsertag(tagName, myUid);
        return new ErrorInfos();
    }
}
