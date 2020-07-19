package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAppKey  implements Serializable {
    @Column(name = "uid", nullable = false)
    private Integer uid;

    @Column(name = "aid", nullable = false)
    private Integer aid;
}