package app.repository;

import app.model.UserTag;
import app.model.UserTagKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTagRepository extends JpaRepository<UserTag, UserTagKey> {

    UserTag findFirstByUserTagKeyUidAndUserTagKeyTid(Integer uid, Integer tid);

    @Modifying
    @Query(value = "INSERT INTO usertag (uid, tid) VALUES (?1, ?2);", nativeQuery = true)
    public int insertUserTagByUidIsAndTidIs(Integer uid, Integer tid);

    @Modifying
    @Query(value = "DELETE FROM usertag WHERE uid = ?1 AND tid = ?2 LIMIT 1;", nativeQuery = true)
    public int deleteUserTagByUidIsAndTidIs(Integer uid, Integer tid);
}
