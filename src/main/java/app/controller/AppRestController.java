package app.controller;

import app.config.JView;
import app.model.Apps;
import app.model.Response;
import app.model.Users;
import app.service.AppService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AppRestController<br>
 *　アプリ関連情報を操作するコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class AppRestController {

    @Autowired
    private AppService appService;

    /**
     * getAppList<br>
     * アプリリストを取得する
     * @return アプリリスト
     */
    @JsonView(JView.AppInfo.class)
    @GetMapping("/api/app")
    public String getAppList(){
//    public List<Apps> getAppList(){
//        return appService.selectAppList();
        return "[{\"aid\": 0,\"aname\": \"string\",\"aimgpath\": \"string\",\"aurl\": \"string\"}]";
    }

    /**
     * registApp<br>
     * アプリを登録する
     * @param apps アプリ情報
     * @return 結果
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/app")
    public String registApp(@RequestBody Apps apps){
//    public Response registApp(@RequestBody Apps apps){
//        appService.insertApp(apps);
//        return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }

    /**
     * getAppUserList<br>
     * 指定したアプリの登録ユーザーリストを返す
     *  @param aname urlで指定されたアプリ名
     * @return アプリを登録しているユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/app/@{aname}")
    public String getAppUserList(@PathVariable("aname") String aname) {
//    public List<Users> getAppUserList(@PathVariable("aname") String aname) {
//        return appService.selectUserListByApps(aname);
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
    }

    /**
     * registUserApp<br>
     * ユーザーアプリ関連情報を登録する
     * @param aid アプリID
     * @return 結果
     */
    
    @JsonView(JView.Public.class)
    @PostMapping("/api/app/{aid}")
    public String registUserApp(@PathVariable Integer aid){
//    public Response registUserApp(@PathVariable Integer aid){
//        Integer myUid = 1;
//        appService.insertUserApp(aid, myUid);
//        return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }

    /**
     * removeApp<br>
     * ユーザーアプリ関連情報を削除する
     * @param aid アプリID
     * @return 結果
     */
    @JsonView(JView.Public.class)
    @DeleteMapping("/api/app/{aid}")
    public String removeApp(@PathVariable Integer aid){
//    public Response removeApp(@PathVariable Integer aid){
//        Integer myUid = 1;
//        appService.deleteUserapp(aid, myUid);
//        return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }
}