package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;
import org.springframework.stereotype.Component;

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
@Table(name="users")
@Getter
@Setter
@EqualsAndHashCode(exclude="usertag")
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Users {
//public class User implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid", nullable = false, updatable = false, insertable = false)
	@NotNull()
	private Integer uid;

	@JsonView({JView.UserInfo.class, JView.follow.class})
	@Column(name = "userid", unique = true , nullable = false)
	@NotBlank
	private String userid;

	@JsonView({JView.UserInfo.class, JView.follow.class})
	@Column(name = "uname", nullable = false)
	@NotBlank
	private String uname;

//	@JsonIgnore
//	@Column(name = "umail")
//	private String umail;

	@JsonView({JView.UserInfo.class, JView.follow.class})
	@Column(name = "udesc")
	private String udesc;

	@JsonView({JView.UserInfo.class, JView.follow.class})
	@Column(name = "uimgpath")
	private String uimgpath;

	@JsonIgnore
	@Column(name = "udisabled")
	private Boolean udisabled;

	@JsonView(JView.UserDetail.class)
	@Transient
	private Integer FollowCount;

	@JsonView(JView.UserDetail.class)
	@Transient
	private Integer FollowerCount;
//
//	@ManyToMany(cascade=CascadeType.DETACH)
//	@JoinTable(
//			name="userapp",
//			joinColumns=@JoinColumn(name="uid", insertable = false, updatable = false),
//			inverseJoinColumns=@JoinColumn(name="aid")
//	)
//	private List<Apps> appsList;
//


	@JsonView(JView.follow.class)
	@Transient
	private List<Users> followlist;

	@JsonView(JView.follower.class)
	@Transient
	private List<Users> followerlist;


	@JsonView(JView.UserDetail.class)
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<UserTag> usertag;


	@JsonView(JView.UserDetail.class)
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<UserApp> userapp;

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