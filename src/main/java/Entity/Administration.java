package Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Entity
@Setter
@Getter
@SQLDelete(sql = "UPDATE administration SET isActive = TRUE WHERE id=?")
@Where(clause = "soft_delete = false")
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Administration {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    private int dni;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    private String phone;
    private String email;

    @Column(name = "date_admission", nullable = false)
    private Timestamp timestamp = Timestamp.from(Instant.now());

    @Column(nullable = false)
    private Date dateOfBirth;

    private boolean isActive = Boolean.FALSE;;



}
