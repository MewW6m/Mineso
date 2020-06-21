package app.main.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Settings<br>
 *　設定情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@Component
public class Settings{
	@Id
	private int SettingId;
	private int uId;
	private boolean userEnabled;
	private boolean userVisibled;
	private String designSettings;
}