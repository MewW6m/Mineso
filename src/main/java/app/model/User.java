package app.model;

import org.springframework.stereotype.Component;

import lombok.Data;

import javax.persistence.Column;
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
	private int uid;
	@Column
	private String userid;
	@Column
	private String username;
	@Column
	private String usermail;
	@Column
	private String userdesc;
	@Column
	private String userimg;
}