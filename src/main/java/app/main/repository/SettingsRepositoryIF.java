package app.main.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import app.main.domain.SettingsDomainIF;

/**
 * SettingsRepositoryIFインターフェース<br>
 * 設定をDBから取得するインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface SettingsRepositoryIF{
   
    /**
    * selectSettingsメソッド<br>
    * 設定を{key,value}をもとにDBから取得するメソッド
    *  @param key 検索する項目
    *  @param value 検索する値
    * @return SettingsDomainIF 設定情報
    * @throws DataAccessException データアクセスエクセプション
    */
	public SettingsDomainIF selectSettings(String key, Object value) throws DataAccessException;
}