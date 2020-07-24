package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "userapp")
@EqualsAndHashCode(exclude={"users", "apps"})
@NoArgsConstructor
@Component
public class UserApp {

    public UserApp (Integer uid, Integer aid){
        userAppKey.setUid(uid);
        userAppKey.setAid(aid);
    }

    @EmbeddedId
    private UserAppKey userAppKey;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "uid", insertable = false, updatable = false)
    @MapsId("uid")
    private Users users;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "aid", insertable = false, updatable = false)
    @MapsId("aid")
    private Apps apps;

    @JsonView(JView.UserDetail.class)
    public Integer getUid(){ return userAppKey.getUid(); }

    @JsonView(JView.UserDetail.class)
    public Integer getAid(){ return userAppKey.getAid(); }
    public void setUid(Integer uid){ userAppKey.setUid(uid); }
    public void setAid(Integer aid){ userAppKey.setAid(aid); }

}