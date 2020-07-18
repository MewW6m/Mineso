package app.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class UserTagKey implements Serializable {
    //    @Column(name = "uid", nullable = false)
    private Integer uid;

    //    @Column(name = "tid", nullable = false)
    private Integer tid;
}
