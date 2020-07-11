package app.service;

import app.config.Util;
import app.model.Settings;
import app.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;


@Service
@Transactional(readOnly = true)
public class SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;

    @Autowired
    private Util util;

    /**
     * getSettings<br>
     * 設定情報を取得する
     *  @param uid ユーザー情報ID
     * @return Settings 設定情報返す
     */
    public Settings getSettings(int uid){
        return settingsRepository.findFirstByUid(uid)
                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
    }

    /**
     * postSettings<br>
     * 設定情報を設定する
     *  @param uid ユーザー情報ID
     *  @param settingMap 設定情報
     */
    @Transactional(readOnly = false)
    public void postSettings(int uid, Map<String, Object> settingMap) throws Exception {
        Settings settings = settingsRepository.findFirstByUid(uid)
                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        util.mapping(settings, settingMap);
        settingsRepository.saveAndFlush(settings);

    }
}