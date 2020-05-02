package app.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.main.domain.SettingsDomainIF;
import app.main.domain.SettingsDomainImpl;

/**
 * SettingsRepositoryImplクラス<br>
 * 設定をDBから取得する実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public class SettingsRepositoryImpl implements SettingsRepositoryIF{
    @Autowired(required=false)
    private JdbcTemplate jdbc;
	
    @Override
	public SettingsDomainIF selectSettings(String key, Object value) throws DataAccessException{
    	String sql = "select * from SettingsList WHERE " + key + "= ?"; 
    	RowMapper<SettingsDomainImpl> rowMapper = new BeanPropertyRowMapper<>(SettingsDomainImpl.class);    	
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}