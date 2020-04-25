package app.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.main.domain.UserDomain;

//　ユーザー情報をDBから取得する実装クラス
@Repository
public class UserRepositoryImpl implements UserRepositoryIF{
	// JDBCインスタンスを取得する
    @Autowired(required=false)
    private JdbcTemplate jdbc;
	
    // 1人のユーザー情報を{key,value}をもとにDBから取得するメソッド 
    @Override
	public UserDomain selectUser(String key, Object value) throws DataAccessException {
    	String sql = "select * from UserList WHERE " + key + "= ?"; 
    	RowMapper<UserDomain> rowMapper = new BeanPropertyRowMapper<>(UserDomain.class);    	
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}