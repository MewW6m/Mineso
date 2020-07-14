package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
	private Integer uid;

	@JsonView(JView.UserInfo.class)
	@Column(name = "userid", unique = true , nullable = false)
	@NotBlank
	private String userid;

	@JsonView(JView.UserInfo.class)
	@Column(name = "uname", nullable = false)
	@NotBlank
	private String uname;

	@JsonView(JView.UserInfo.class)
	@Column(name = "umail")
	private String umail;

	@JsonView(JView.UserInfo.class)
	@Column(name = "udesc")
	private String udesc;

	@JsonView(JView.UserInfo.class)
	@Column(name = "uimgpath")
	private String uimgpath;

	@JsonIgnore
	@Column(name = "udisabled")
	private Boolean udisabled;

	@JsonView(JView.UserInfo.class)
	@Transient
	private Integer FollowCount;

	@JsonView(JView.UserInfo.class)
	@Transient
	private Integer FollowerCount;

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


	//@JoinTable(name="follow", joinColumns=@JoinColumn(table="users", name="followerid", referencedColumnName="uid"), inverseJoinColumns=@JoinColumn(table="users",name="followid", referencedColumnName="uid"))
//	@JoinTable(name="follow", joinColumns=@JoinColumn(name="followid", referencedColumnName = "uid"), inverseJoinColumns=@JoinColumn(name="followerid", referencedColumnName = "uid"))

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "follow",
//			joinColumns = @JoinColumn(name = "followerid"),
//			inverseJoinColumns = @JoinColumn(name = "uid"))
//	private List<Users> follow;



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