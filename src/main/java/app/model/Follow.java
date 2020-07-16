package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="follow")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Follow {
    @Id
    @Column(name = "followerid")
    private Integer folloewerid;
    @Column(name = "followid")
    private Integer folloewid;
}
