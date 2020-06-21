package app.main.model;

import org.springframework.stereotype.Component;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User<br>
 *　ユーザー情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@Component
public class User {
	@Id
	private int uId;
	private String userId;
	private String userName;
	private String userMailAddres;
	private String userDescription;
	private String userImage;
}