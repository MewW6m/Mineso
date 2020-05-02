package app.main.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import app.main.domain.UserDomainIF;

/**
 * UserRepositoryIFインターフェース<br>
 * ユーザー情報をDBから取得するインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface UserRepositoryIF{ 
    
	/**
    * selectUserメソッド<br>
    * 1人のユーザー情報を{key,value}をもとにDBから検索し取得する
    *  @param key 検索する項目
    *  @param value 検索する値
    * @return UserDomainIF ユーザー情報返す
    * @throws DataAccessException データアクセスエクセプション
    */
	public UserDomainIF selectUser(String key, Object value) throws DataAccessException;
}