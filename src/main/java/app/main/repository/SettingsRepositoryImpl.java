package app.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.main.domain.SettingsDomain;

//　設定をDBから取得する実装クラス
@Repository
public class SettingsRepositoryImpl implements SettingsRepositoryIF{
	// JDBCインスタンスを取得する
    @Autowired(required=false)
    private JdbcTemplate jdbc;
	
    // 設定を{key,value}をもとにDBから取得するメソッド 
    @Override
	public SettingsDomain selectSettings(String key, Object value) throws DataAccessException{
    	String sql = "select * from SettingsList WHERE " + key + "= ?"; 
    	RowMapper<SettingsDomain> rowMapper = new BeanPropertyRowMapper<>(SettingsDomain.class);    	
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}