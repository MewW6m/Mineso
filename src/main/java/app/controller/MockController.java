package app.controller;

import app.config.JView;
import app.model.*;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MockController {

    @PostMapping("/api/auth/{socialtype}")
    public String postAuth(@PathVariable("socialType") String socialType) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/user/@{userid}")
    public String getUserInfo(@PathVariable("userid") String userid) {
        return "{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\",\"followcount\": 0,\"followercount\": 0,\"taglist\": [{\"tid\": 0,\"tname\": \"string\"}],\"applist\": [{\"aid\": 0,\"aname\": \"string\",\"aimgpath\": \"string\",\"aurl\": \"string\"}]}";
    }

    @PatchMapping("/api/user/@{userid}")
    public String postUserInfo(@RequestBody @JsonView(JView.UserInfo.class) Users users, BindingResult error) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @DeleteMapping("/api/user/@{userid}")
    public String delUserInfo(@PathVariable("userid") String userid) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/user/follow/@{userid}")
    public String getFollowList(@PathVariable("userid") String userid)  {
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
    }

    @PostMapping("/api/user/follow/@{userid}")
    public String addFollow(@PathVariable("userid") String userid) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @DeleteMapping("/api/user/follow/@{userid}")
    public String delFollow(@PathVariable("userid") String userid) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/user/follower/@{userid}")
    public String getFollowerList(@PathVariable("userid") String userid)  {
        return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]";
    }

    @GetMapping("/api/setting/profile")
    public String getProfileSetting() { return "{\"sid\": 0}"; }

    @PatchMapping("/api/setting/profile")
    public String postProfileSetting(@RequestBody @JsonView(JView.Profile.class) Settings settings) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/setting/account")
    public String getAccountSetting() { return "{\"sid\": 0,\"umail\": \"string\"}"; }

    @PatchMapping("/api/setting/account")
    public String postAccountSetting(@RequestBody @JsonView(JView.Account.class) Settings settings) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/setting/nortification")
    public String getNortificationSetting() { return "{\"sid\": 0}"; }

    @PatchMapping("/api/setting/nortification")
    public String postNortificationSetting(@RequestBody @JsonView(JView.Nortification.class) Settings settings) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/setting/customize")
    public String getCustomizeSetting() { return "{\"sid\": 0}"; }

    @PatchMapping("/api/setting/customize")
    public String postCustomizeSetting(@RequestBody @JsonView(JView.Customize.class) Settings settings) { return "{\"code\": 0,\"message\": \"string\"}"; }


    @GetMapping("/api/nortification")
    public String getNortificationList() throws Exception { return "[{\"nid\": \"string\",\"ntitle\": \"string\",\"ndetail\": \"string\",\"ntype\": \"string\",\"ndate\": \"2020-07-23T06:00:28Z\"}]"; }

    @PatchMapping("/api/nortification")
    public String postNortification(@RequestBody List<Integer> nIdList) throws Exception { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/tag")
    public String getTagList(){
        return "[{\"tid\": 0,\"tname\": \"string\"}]";
    }

    @GetMapping("/api/tag/@{tname}")
    public String getTagUserList(@PathVariable("tname") String tname) { return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]"; }

    @PutMapping("/api/tag/@{tname}")
    public String registUserTag(@PathVariable("tname") String tname)  { return "{\"code\": 0,\"message\": \"string\"}"; }

    @DeleteMapping("/api/tag/@{tname}")
    public String removeUserTag(@PathVariable("tname") String tname)  { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/app")
    public String getAppList(){ return "[{\"aid\": 0,\"aname\": \"string\",\"aimgpath\": \"string\",\"aurl\": \"string\"}]"; }

    @PutMapping("/api/app")
    public String registApp(@RequestBody Apps apps) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @GetMapping("/api/app/@{aname}")
    public String getAppUserList(@PathVariable("aname") String aname) { return "[{\"userid\": \"string\",\"uname\": \"string\",\"udesc\": \"string\",\"uimgpath\": \"string\"}]"; }

    @PostMapping("/api/app/@{aname}")
    public String registUserApp(@PathVariable("aname") String aname) { return "{\"code\": 0,\"message\": \"string\"}"; }

    @DeleteMapping("/api/app/@{aname}")
    public String removeApp(@PathVariable("aname") String aname) { return "{\"code\": 0,\"message\": \"string\"}"; }
}
