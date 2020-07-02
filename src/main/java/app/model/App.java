package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * App<br>
 *　アプリ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class App {
	@Id
	private int aid;
//	private int uId;
	private boolean appdisabled;
	@Column(unique=true)
	private String appname;
	private String appimgpath;
	private String appurl;
}