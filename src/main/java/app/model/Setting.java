package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Settings<br>
 *　設定情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Setting {
	@Id
	private int sid;
	@Column
	private int uid;
	@Column
	private boolean userenabled;
	@Column
	private boolean uservisibled;
	@Column
	private String designsettings;
}