package app.service;

import app.model.Users;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserService<br>
 * ユーザー情報を取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class UserService  {
//public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    /**
     * getUserメソッド<br>
     * ユーザー情報(ユーザーと設定)を設定する
     *  @param userId ユーザーID
     * @return User ユーザー情報返す
     */
    public Users getUser(String userid) {
    	return userRepository.findFirstByUserid(userid);
    }

/*
    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || "".equals(username)) {
            throw new UsernameNotFoundException("Username is empty");
        }

        User user = userRepository.findFirstByUserid(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        return user;
    }*/
}