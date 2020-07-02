package app.service;

import app.model.Setting;
import app.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

    @Autowired
    SettingsRepository settingsRepository;

    /**
     * getSettingsメソッド<br>
     * ユーザー情報(ユーザーと設定)を設定する
     *  @param uid ユーザー情報ID
     * @return Settings 設定情報返す
     */
    public Setting getSettings(int uid){
        return settingsRepository.findFirstByUid(uid);
    }
}