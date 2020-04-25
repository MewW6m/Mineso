package app.main.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

// User情報クラス
@Data
@Component
public class UserDomain{
	private int uId;
	private String userId;
	private String userName;
	private String userMailAddres;
	private String userDescription;
	private String userImage;
}