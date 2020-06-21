package app.service;

import app.model.User;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService<br>
 * ユーザー情報を取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * getUserメソッド<br>
     * ユーザー情報(ユーザーと設定)を設定する
     *  @param userid ユーザーID
     * @return User ユーザー情報返す
     */
    public User getUser(String userid) {
    	return userRepository.findFirstByUserid(userid);
    }

}