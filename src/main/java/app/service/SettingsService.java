package app.service;

import app.config.Util;
import app.model.Settings;
import app.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;

/**
 * SettingsService<br>
 * 設定情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
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
     *  @param settings 設定情報
     * @throws Exception 例外
     */
    @Transactional(readOnly = false)
    public void postSettings(int uid, Settings settings) throws Exception {
        Settings baseSettings = settingsRepository.findFirstByUid(uid).orElseThrow(() -> new Exception());
        util.copyNonNullProperties(settings, baseSettings);
        settingsRepository.saveAndFlush(baseSettings);
    }
}