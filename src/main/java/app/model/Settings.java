package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

	@JsonView({JView.Account.class,JView.Profile.class, JView.Nortification.class, JView.Customize.class})
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	@NotNull
	private int sid;

	@Column(name = "uid", nullable = false, updatable = false, insertable = false)
	private int uid;

	@Column(name = "uservisibled")
	private boolean uservisibled;

	@JsonView(JView.Account.class)
	@Column(name = "accountsetting1")
	@NotBlank
	private String accountsetting1;

	@JsonView(JView.Profile.class)
	@Column(name = "profilesetting1")
	@NotBlank
	private String profilesetting1;

	@JsonView(JView.Nortification.class)
	@Column(name = "norsetting1")
	@NotBlank
	private String norsetting1;

	@JsonView(JView.Customize.class)
	@Column(name = "customizesetting1")
	@NotBlank
	private String customizesetting1;

	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid", referencedColumnName="uid")
	private Users users;
}