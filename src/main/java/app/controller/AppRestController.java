package app.controller;

import app.config.JView;
import app.model.Apps;
import app.model.ErrorInfos;
import app.model.Tags;
import app.model.Users;
import app.service.AppService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
     * @return
     */
    @JsonView(JView.AppInfo.class)
    @GetMapping("/api/app/get")
    public List<Apps> getAppList(){
        return appService.selectAppList();
    }

    /**
     * getAppUserList<br>
     * 指定したアプリの登録ユーザーリストを返す
     *  @param aname urlで指定されたアプリ名
     * @return List<User> アプリを登録しているユーザーリスト
     */
    @JsonView(JView.UserInfo.class)
    @GetMapping("/api/app/get/{aname}")
    public List<Users> getAppUserList(@PathVariable("aname") String aname) {
        return appService.selectUserListByApps(aname);
    }

    /**
     * registApp<br>
     * アプリを登録する
     * @param apps
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/app/regist")
    public ErrorInfos registApp(@RequestBody Apps apps){
        appService.insertApp(apps);
        return new ErrorInfos();
    }

    /**
     * registUserApp<br>
     * ユーザーアプリ関連情報を登録する
     * @param aid
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/app/regist/{aid}")
    public ErrorInfos registUserApp(@PathVariable Integer aid){
        Integer myUid = 1;
        appService.insertUserApp(aid, myUid);
        return new ErrorInfos();
    }

    /**
     * removeApp<br>
     * ユーザーアプリ関連情報を削除する
     * @param aid
     * @return
     */
    @JsonView(JView.Public.class)
    @PostMapping("/api/app/remove/{aid}")
    public ErrorInfos removeApp(@PathVariable Integer aid){
        Integer myUid = 1;
        appService.deleteUserapp(aid, myUid);
        return new ErrorInfos();
    }
}
