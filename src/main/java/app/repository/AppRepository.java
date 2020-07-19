package app.repository;

import app.model.Apps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AppRepository<br>
 * アプリ情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface AppRepository extends JpaRepository<Apps, Long> {

    public Apps findFirstByAname(String aname);

}
