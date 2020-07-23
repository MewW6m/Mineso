package app.controller;

import app.config.JView;
import app.model.Response;
import app.model.Tags;
import app.model.Users;
import app.service.TagService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     *  @param tname タグ名
     * @return List<User> タグ付けユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/tag/@{tname}")
    public List<Users> getTagUserList(@PathVariable("tname") String tname) {
        return tagService.selectUserListByTags(tname);
    }

    /**
     * registUserTag<br>
     * ユーザータグを登録する
     * @param tagName タグ名
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/tag/@{tname}")
    public Response registUserTag(@PathVariable("tname") String tagName) {
        Integer myUid = 1;
        tagService.insertUserTag(tagName, myUid);
        return new Response();
    }

    /**
     * deleteUserTag<br>
     * ユーザータグを削除する
     * @param tagName
     * @return
     */
    @JsonView(JView.Public.class)
    @DeleteMapping("/api/tag/@{tname}")
    public Response removeUserTag(@PathVariable("tname") String tagName) {
        Integer myUid = 1;
        tagService.deleteUsertag(tagName, myUid);
        return new Response();
    }
}
