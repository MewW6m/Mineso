package app.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.main.domain.UserDomainIF;
import app.main.domain.UserDomainImpl;

/**
 * UserRepositoryImplクラス<br>
 * ユーザー情報をDBから取得する実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public class UserRepositoryImpl implements UserRepositoryIF{
    @Autowired(required=false)
    private JdbcTemplate jdbc;
	 
    @Override
	public UserDomainIF selectUser(String key, Object value) throws DataAccessException {
    	String sql = "select * from UserList WHERE " + key + "= ?"; 
    	RowMapper<UserDomainImpl> rowMapper = new BeanPropertyRowMapper<>(UserDomainImpl.class);    	
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}