package app.service;

import app.model.Settings;
import app.model.Users;
import app.repository.SettingsRepository;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
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
    private UserRepository userRepository;

    @Autowired
    private SettingsRepository settingsRepository;

    /**
     * getUser<br>
     * ユーザー情報(ユーザーと設定)を設定する
     *  @param userid ユーザーID
     */
    public Users getUser(String userid) throws Exception {
    	Users user = userRepository.findFirstByUserid(userid);
        Settings settings = settingsRepository.findFirstByUid(user.getUid()).orElseThrow(() -> new Exception());
        if(settings.getUservisibled() && !user.getUdisabled()){
            return user;
        } else {
            throw new Exception();
        }
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