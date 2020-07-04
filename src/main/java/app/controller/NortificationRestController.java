package app.controller;

import app.model.ErrorInfos;
import app.model.Nortifications;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * NortificationControllerクラス<br>
 *　通知情報を返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class NortificationRestController {

    /**
     * getNortificationListメソッド<br>
     * 通知情報リストを返す
     *  @param userId ユーザーID
     * @return List<Nortification> 通知リスト
     */
    @GetMapping("/api/nortification/{userId}")
    public List<Nortifications> getNortificationList(@PathVariable("userId") String userId){
        return new ArrayList<Nortifications>();
    }

    /**
     * postNortificationメソッド<br>
     * 通知を更新する
     *  @param userId ユーザーID
     *  @param nIdList 通知IDリスト
     * @return ErrorInfo エラー情報
     */
    @PostMapping("/api/nortification/{userId}")
    public ErrorInfos postNortification(@PathVariable("userId") String userId, @RequestBody List<String> nIdList){
        return new ErrorInfos();
    }
}
