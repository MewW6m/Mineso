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
     * @return タグリスト
     */
    @JsonView(JView.TagInfo.class)
    @GetMapping("/api/tag")
    public String getTagList(){
//    public List<Tags> getTagList(){
//        return tagService.selectTagList();
        return "[{\"tid\": 0,\"tname\": \"string\"}]";
    }

    /**
     * getTagUserList<br>
     * 指定したタグのタグ付けユーザーリストを返す
     *  @param tname タグ名
     * @return タグ付けユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/tag/@{tname}")
    public String getTagUserList(@PathVariable("tname") String tname) {
//    public List<Users> getTagUserList(@PathVariable("tname") String tname) {
//        return tagService.selectUserListByTags(tname);
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
    }

    /**
     * registUserTag<br>
     * ユーザータグを登録する
     * @param tname タグ名
     * @return 結果
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/tag/@{tname}")
    public String registUserTag(@PathVariable("tname") String tname) {
//    public Response registUserTag(@PathVariable("tname") String tname) {
//        Integer myUid = 1;
//        tagService.insertUserTag(tname, myUid);
//        return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }

    /**
     * deleteUserTag<br>
     * ユーザータグを削除する
     * @param tname タグ名
     * @return 結果
     */
    @JsonView(JView.Public.class)
    @DeleteMapping("/api/tag/@{tname}")
    public String removeUserTag(@PathVariable("tname") String tname) {
//  public Response removeUserTag(@PathVariable("tname") String tname) {
//      Integer myUid = 1;
//      tagService.deleteUsertag(tname, myUid);
//      return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }
}