package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Users;

/**
 * UserRepository<br>
 * ユーザー情報をDBから取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	/**
	 * findFirstByUserId<br>
	 * 1人のユーザー情報を{key,value}をもとにDBから検索し取得する
	 *  @param userid 検索する項目
	 * @return User ユーザー情報返す
	 */
	public Users findFirstByUserid(String userid);
}