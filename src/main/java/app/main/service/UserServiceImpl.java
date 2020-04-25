package app.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.main.domain.SettingsDomain;
import app.main.domain.UserDomain;
import app.main.repository.SettingsRepositoryIF;
import app.main.repository.UserRepositoryIF;

// ユーザー情報を取得する実装クラス
@Service
public class UserServiceImpl implements UserServiceIF{
	// UserDomainインスタンスを取得する
    @Autowired(required=false)
    private UserDomain user;

	// SettingsDomainインスタンスを取得する
    @Autowired(required=false)
    private SettingsDomain settings;
    
	// UserRepositoryインスタンスを取得する
    @Autowired(required=false)
    private UserRepositoryIF userRepository;
    
	// SettingsRepositoryインスタンスを取得する
    @Autowired(required=false)
    private SettingsRepositoryIF settingsRepository;
    
	// ユーザー情報を取得する
    @Override
    public void getUser(String userId) {
    	user = userRepository.selectUser("userId", userId);
    	settings = settingsRepository.selectSettings("uId", user.getUId());
    }
    
	// ユーザー名を取得する
    @Override
	public String getUserName(String userId){
		return user.getUserName();
	}
	
	// ユーザーメールアドレスを取得する
    @Override
	public String getUserMailAddres(String userId){
		return user.getUserMailAddres();
	}
	
	// ユーザーの詳細を取得する
    @Override
	public String getUserDescription(String userId){
		return user.getUserDescription();
	}
	
	// ユーザーの画像を取得する
    @Override
	public String getUserImage(String userId){
		return user.getUserImage();
	}
    
	// ユーザーを使用できるかを判別する
    @Override
	public Boolean getUserEnabled(String userId) {
    	return settings.isUserEnabled();
    }
    
	// ユーザーが見えるかを判別する
    @Override
	public Boolean getUserVisibled(String userId) {
    	return settings.isUserVisibled();
    }
}