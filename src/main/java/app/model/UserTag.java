package app.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "usertag")
@EqualsAndHashCode(exclude={"users", "tags"})
@NoArgsConstructor
@Component
public class UserTag {

    public UserTag (Integer uid, Integer tid){
        userTagKey.setUid(uid);
        userTagKey.setTid(tid);
    }

    @EmbeddedId
    private UserTagKey userTagKey;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "uid", insertable = false, updatable = false)
    @MapsId("uid")
    private Users users;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "tid", insertable = false, updatable = false)
    @MapsId("tid")
    private Tags tags;

    public Integer getUid(){ return userTagKey.getUid(); }
    public Integer getTid(){ return userTagKey.getTid(); }
    public void setUid(Integer uid){ userTagKey.setUid(uid); }
    public void setTid(Integer tid){ userTagKey.setTid(tid); }

}