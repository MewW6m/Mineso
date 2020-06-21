package app.main.repository;

import app.main.model.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * SettingsRepository<br>
 * 設定をDBから取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public class SettingsRepository {
    @Autowired
    private JdbcTemplate jdbc;

	/**
	 * selectSettingsメソッド<br>
	 * 設定を{key,value}をもとにDBから取得するメソッド
	 *  @param key 検索する項目
	 *  @param value 検索する値
	 * @return SettingsDomainIF 設定情報
	 * @throws DataAccessException データアクセスエクセプション
	 */
	public Settings selectSettings(String key, Object value) throws DataAccessException{
    	String sql = "select * from SettingsList WHERE " + key + "= ?"; 
    	RowMapper<Settings> rowMapper = new BeanPropertyRowMapper<>(Settings.class);
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}