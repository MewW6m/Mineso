package app.controller;

import app.model.Response;
import app.model.Nortifications;
import app.service.NortificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * NortificationControllerクラス<br>
 *　通知情報を返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class NortificationRestController {

    @Autowired
    private NortificationService nortificationService;

    /**
     * getNortificationList<br>
     * 通知情報リストを返す
     *  @param uid ユーザーID
     * @return 通知リスト
     * @throws Exception 例外
     */
    @GetMapping("/api/nortification/{uid}")
    public String getNortificationList(@PathVariable("uid") int uid) throws Exception {
//    public List<Nortifications> getNortificationList(@PathVariable("uid") int uid) throws Exception {
//        return nortificationService.selectNorList(uid);
        return "[{\"nid\": \"string\",\"ntitle\": \"string\",\"ndetail\": \"string\",\"ntype\": \"string\",\"ndate\": \"2020-07-23T06:00:28Z\"}]";
    }

    /**
     * postNortification<br>
     * 通知を更新する
     *  @param uid ユーザーID
     *  @param nIdList 通知IDリスト
     * @return レスポンス情報
     * @throws Exception 例外
     */
    @PostMapping("/api/nortification/{uid}")
    public String postNortification(@PathVariable("uid") int uid, @RequestBody List<Integer> nIdList) throws Exception {
//    public Response postNortification(@PathVariable("uid") int uid, @RequestBody List<Integer> nIdList) throws Exception {
//        nortificationService.updateNorList(nIdList);
//        return new Response();
        return "{\"code\": 0,\"message\": \"string\"}";
    }
}
