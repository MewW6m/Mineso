package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.model.Users;

import java.util.HashMap;
import java.util.List;

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

	@Query(value = "SELECT SUM(CASE X.kbn WHEN 'follow' THEN X.cnt ELSE 0 END) AS follow_count, SUM(CASE X.kbn WHEN 'follower' THEN X.cnt ELSE 0 END) AS follower_count FROM (SELECT 'follow' AS kbn, fl.followerid AS followerid, count(fl.followid) AS cnt FROM follow fl GROUP BY fl.followerid UNION ALL SELECT 'follower' AS kbn, flw.followid AS followerid, count(flw.followerid) AS cnt FROM follow flw GROUP BY flw.followid) X WHERE  X.followerid = ?1 GROUP BY X.followerid;", nativeQuery = true)
	public List<List<Integer>> getFollowCount(Integer uid);
}