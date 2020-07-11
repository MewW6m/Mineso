package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Nortifications;
import com.fasterxml.jackson.annotation.JsonView;
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

    /**
     * getNortificationList<br>
     * 通知情報リストを返す
     *  @param uid ユーザーID
     * @return List<Nortification> 通知リスト
     */
    @JsonView(JView.NortificationInfo.class)
    @GetMapping("/api/nortification/{uid}")
    public List<Nortifications> getNortificationList(@PathVariable("uid") int uid){
        List<Nortifications> norList = new ArrayList<>();
        Nortifications nor = new Nortifications();
        nor.setNid(1);
        nor.setNtitle("norTitle1");
        nor.setNdetail("norDetail1");
        nor.setNtype("type1");
        nor.setNdate(new Date());
        norList.add(nor);
        norList.add(nor);
        return norList;
    }

    /**
     * postNortification<br>
     * 通知を更新する
     *  @param uid ユーザーID
     *  @param nIdList 通知IDリスト
     * @return ErrorInfo エラー情報
     */
    @PostMapping("/api/nortification/{uid}")
    public ErrorInfos postNortification(@PathVariable("uid") int uid, @RequestBody List<Integer> nIdList){
        return new ErrorInfos();
    }
}
