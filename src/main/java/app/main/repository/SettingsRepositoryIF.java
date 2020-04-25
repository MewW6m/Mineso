package app.main.repository;

import org.springframework.dao.DataAccessException;

import app.main.domain.SettingsDomain;

// 設定をDBから取得するインターフェース
public interface SettingsRepositoryIF{
    // 設定を{key,value}をもとにDBから取得するメソッド 
	public SettingsDomain selectSettings(String key, Object value) throws DataAccessException;
}