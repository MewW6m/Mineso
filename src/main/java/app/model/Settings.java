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
//	@NotNull(groups = {JView.Account.class,JView.Profile.class, JView.Nortification.class, JView.Customize.class})
	private Integer sid;

	@Column(name = "uid", nullable = false, updatable = false, insertable = false)
	private Integer uid;

	@Column(name = "uservisibled")
	private Boolean uservisibled;

	@JsonView(JView.Account.class)
	@Column(name = "umail")
	private String umail;

	@JsonView(JView.Account.class)
	@Column(name = "accountsetting1")
	@NotBlank(groups = JView.Account.class)
	private String accountsetting1;

	@JsonView(JView.Profile.class)
	@Column(name = "profilesetting1")
	@NotBlank(groups = JView.Profile.class)
	private String profilesetting1;

	@JsonView(JView.Nortification.class)
	@Column(name = "norsetting1")
	@NotBlank(groups = JView.Nortification.class)
	private String norsetting1;

	@JsonView(JView.Customize.class)
	@Column(name = "customizesetting1")
	@NotBlank(groups = JView.Customize.class)
	private String customizesetting1;

	@JsonIgnore
	@Column(name = "sdisabled")
	private Boolean sdisabled;

	@JsonIgnore
	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="uid", referencedColumnName="uid")
	private Users users;
}