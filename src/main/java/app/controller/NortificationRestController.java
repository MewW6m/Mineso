package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Nortifications;
import app.service.NortificationService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
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
     * @return List<Nortification> 通知リスト
     */
    @GetMapping("/api/nortification/{uid}")
    public List<Nortifications> getNortificationList(@PathVariable("uid") int uid) throws Exception {
        return nortificationService.selectNorList(uid);
    }

    /**
     * postNortification<br>
     * 通知を更新する
     *  @param uid ユーザーID
     *  @param nIdList 通知IDリスト
     * @return ErrorInfo エラー情報
     */
    @PostMapping("/api/nortification/{uid}")
    public ErrorInfos postNortification(@PathVariable("uid") int uid, @RequestBody List<Integer> nIdList) throws Exception {
        nortificationService.updateNorList(uid, nIdList);
        return new ErrorInfos();
    }
}
