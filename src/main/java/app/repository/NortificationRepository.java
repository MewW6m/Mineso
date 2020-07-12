package app.repository;

import app.model.Nortifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NortificationRepository extends JpaRepository<Nortifications, Long> {

    /**
     * findByUid<br>
     * 通知リストをuidをもとにDBから取得するメソッド
     *  @param uid ユーザー情報ID
     * @return Settings 通知リスト
     */
    public List<Nortifications> findByUid(int uid);

    /**
     * findFirstByUid<br>
     * 通知情報をsidをもとにDBから取得するメソッド
     *  @param nid 通知情報ID
     * @return Settings 通知リスト
     */
    public Optional<Nortifications> findFirstByNid(int nid);
}
