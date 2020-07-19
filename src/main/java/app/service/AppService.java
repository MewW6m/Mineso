package app.service;

import app.model.Apps;
import app.model.Users;
import app.repository.AppRepository;
import app.repository.UserAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * AppService<br>
 * アプリ情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
@Transactional(readOnly = true)
public class AppService {

    @Autowired
    private AppRepository appRepository;

    @Autowired
    private UserAppRepository userAppRepository;

    /**
     * selectAppList
     * アプリリストを取得する<br>
     * @return アプリリスト
     */
    public List<Apps> selectAppList(){
        return appRepository.findAll();
    }

    /**
     * selectUserListByApps<br>
     * アプリ名からユーザーリストを取得する
     * @param appname アプリ名
     * @return ユーザーリスト
     */
    public List<Users> selectUserListByApps(String appname){
        // アプリを検索する
        Apps apps = appRepository.findFirstByAname(appname);
        List<Users> usersList = new ArrayList<>();
        // ユーザーリストを作成する
        apps.getUserapp().forEach((ut) ->{
            usersList.add(ut.getUsers());
        });
        return usersList;
    }

    /**
     * insertApp<br>
     * アプリを登録する
     * @param apps アプリ情報
     */
    @Transactional(readOnly = false)
    public void insertApp(Apps apps){
        appRepository.saveAndFlush(apps);
    }

    /**
     * insertUserApp<br>
     * ユーザーアプリ関連情報を追加する(アプリがなければアプリも登録する)
     * @param aid アプリID
     * @param uid ユーザー固有ID
     */
    @Transactional(readOnly = false)
    public void insertUserApp(Integer aid, Integer uid){
        // ユーザーアプリ関連情報を追加する
        userAppRepository.insertUserAppByUidIsAndAidIs(uid, aid);
    }

    /**
     * deleteUserapp<br>
     * ユーザーアプリ関連情報を削除する
     * @param aid アプリID
     * @param uid ユーザー固有ID
     */
    @Transactional(readOnly = false)
    public void deleteUserapp(Integer aid, Integer uid){
        // ユーザーアプリ関連情報を削除する
        userAppRepository.deleteUserAppByUidIsAndAidIs(uid, aid);
    }
}
