package app.repository;


import app.model.UserApp;
import app.model.UserAppKey;
import app.model.UserTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends JpaRepository<UserApp, UserAppKey> {

    UserTag findFirstByUserAppKeyUidAndUserAppKeyAid(Integer uid, Integer aid);

    @Modifying
    @Query(value = "INSERT INTO userapp (uid, aid) VALUES (?1, ?2);", nativeQuery = true)
    public int insertUserAppByUidIsAndAidIs(Integer uid, Integer aid);

    @Modifying
    @Query(value = "DELETE FROM userapp WHERE uid = ?1 AND aid = ?2 LIMIT 1;", nativeQuery = true)
    public int deleteUserAppByUidIsAndAidIs(Integer uid, Integer aid);
}
