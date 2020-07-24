//package app.controller;
//
//import app.config.JView;
//import app.model.Apps;
//import app.model.Response;
//import app.model.Users;
//import app.service.AppService;
//import com.fasterxml.jackson.annotation.JsonView;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * AppRestController<br>
// *　アプリ関連情報を操作するコントローラー
// * @author MewW6m　(https://github.com/MewW6m)
// */
//@RestController
//public class AppRestController {
//
//
//    @Autowired
//    private AppService appService;
//
//    /**
//     * getAppList<br>
//     * アプリリストを取得する
//     * @return
//     */
//    @JsonView(JView.AppInfo.class)
//    @GetMapping("/api/app")
//    public List<Apps> getAppList(){
//        return appService.selectAppList();
//    }
//
//    /**
//     * registApp<br>
//     * アプリを登録する
//     * @param apps
//     * @return
//     */
//    @JsonView(JView.Public.class)
//    @PostMapping("/api/app")
//    public Response registApp(@RequestBody Apps apps){
//        appService.insertApp(apps);
//        return new Response();
//    }
//
//    /**
//     * getAppUserList<br>
//     * 指定したアプリの登録ユーザーリストを返す
//     *  @param aname urlで指定されたアプリ名
//     * @return List<User> アプリを登録しているユーザーリスト
//     */
//    @JsonView(JView.UserInfo.class)
//    @GetMapping("/api/app/@{aname}")
//    public List<Users> getAppUserList(@PathVariable("aname") String aname) {
//        return appService.selectUserListByApps(aname);
//    }
//
//    /**
//     * registUserApp<br>
//     * ユーザーアプリ関連情報を登録する
//     * @param aid
//     * @return
//     */
//    @JsonView(JView.Public.class)
//    @PostMapping("/api/app/{aid}")
//    public Response registUserApp(@PathVariable Integer aid){
//        Integer myUid = 1;
//        appService.insertUserApp(aid, myUid);
//        return new Response();
//    }
//
//    /**
//     * removeApp<br>
//     * ユーザーアプリ関連情報を削除する
//     * @param aid
//     * @return
//     */
//    @JsonView(JView.Public.class)
//    @DeleteMapping("/api/app/{aid}")
//    public Response removeApp(@PathVariable Integer aid){
//        Integer myUid = 1;
//        appService.deleteUserapp(aid, myUid);
//        return new Response();
//    }
//}
