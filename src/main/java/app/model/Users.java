package app.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Users<br>
 *　ユーザー情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Users {
//public class User implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid", nullable = false, updatable = false, insertable = false)
	private int uid;
	@Column(name = "userid", unique = true , nullable = false)
	private String userid;
	@Column(name = "uname", nullable = false)
	private String uname;
	@Column(name = "umail")
	private String umail;
	@Column(name = "udesc")
	private String udesc;
	@Column(name = "uimgpath")
	private String uimgpath;
	@Column(name = "udisabled")
	private boolean udisabled;

//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="sId")
//	private Setting setting;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="userapp",
			joinColumns=@JoinColumn(name="uid"),
			inverseJoinColumns=@JoinColumn(name="aid")
	)
	private List<Apps> appsList;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="usertag",
			joinColumns=@JoinColumn(name="uid"),
			inverseJoinColumns=@JoinColumn(name="tid")
	)
	private List<Tags> taglist;
//
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="uid", referencedColumnName="uid")
//	private Settings settings;
/*


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public String getUsername() {
		return username;
	}*/
}