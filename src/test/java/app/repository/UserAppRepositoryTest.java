package app.repository;


import app.model.UserApp;
import app.model.UserAppKey;
import app.model.UserTag;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@SpringBootTest
public interface UserAppRepositoryTest extends JpaRepository<UserApp, UserAppKey> {

}
