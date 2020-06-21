package app.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.main.model.User;

/**
 * UserRepository<br>
 * ユーザー情報をDBから取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbc;

	/**
	 * selectUserメソッド<br>
	 * 1人のユーザー情報を{key,value}をもとにDBから検索し取得する
	 *  @param key 検索する項目
	 *  @param value 検索する値
	 * @return UserDomainIF ユーザー情報返す
	 * @throws DataAccessException データアクセスエクセプション
	 */
	public User selectUser(String key, Object value) throws DataAccessException {
    	String sql = "select * from UserList WHERE " + key + "= ?"; 
    	RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
		return jdbc.queryForObject(sql, rowMapper, String.valueOf(value));
	}
}