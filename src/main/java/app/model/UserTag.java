package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "usertag")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserTag {
    @Id
    @Column(name = "uid", nullable = false, updatable = false, insertable = false)
    private Integer uid;

    @Column(name = "tid", nullable = false, updatable = false, insertable = false)
    private Integer tid;
}
