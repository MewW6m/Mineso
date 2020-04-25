package app.main.service;

import org.springframework.stereotype.Service;

//ユーザー情報を取得するインターフェース
@Service
public interface UserServiceIF{    
	// ユーザー情報を取得する
	public void getUser(String userId);    
	// ユーザー名を取得する
	public String getUserName(String userId);    
	// ユーザーメールアドレスを取得する
	public String getUserMailAddres(String userId);    
	// ユーザーの詳細を取得する
	public String getUserDescription(String userId);    
	// ユーザーの画像を取得する
	public String getUserImage(String userId);    
	// ユーザーを使用できるかを判別する
	public Boolean getUserEnabled(String userId);    
	// ユーザーが見えるかを判別する
	public Boolean getUserVisibled(String userId);
}