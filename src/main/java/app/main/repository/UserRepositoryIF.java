package app.main.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import app.main.domain.UserDomain;

// ユーザー情報をDBから取得するインターフェース
@Repository
public interface UserRepositoryIF{
	// 1人のユーザー情報を{key,value}をもとにDBから取得するメソッド 
	public UserDomain selectUser(String key, Object value) throws DataAccessException;
}