package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Settings<br>
 *　設定情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@DynamicUpdate(value = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Settings {

	@JsonView(JView.Public.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;

	@Column(name = "uid", nullable = false, updatable = false, insertable = false)
	private int uid;

	@Column(name = "uservisibled")
	private boolean uservisibled;

	@JsonView(JView.Account.class)
	@Column(name = "accountsetting1")
	private String accountsetting1;

	@JsonView(JView.Profile.class)
	@Column(name = "profilesetting1")
	private String profilesetting1;

	@JsonView(JView.Nortification.class)
	@Column(name = "norsetting1")
	private String norsetting1;

	@JsonView(JView.Customize.class)
	@Column(name = "customizesetting1")
	private String customizesetting1;

	//@Column
	//private String designsettings;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid", referencedColumnName="uid")
	private Users users;
}