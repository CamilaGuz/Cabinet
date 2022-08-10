package com.cabinet.demo.Entity;


import lombok.*;
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
@SQLDelete(sql = "UPDATE administration SET is_active = TRUE WHERE id=?")
@Where(clause = "is_active = false")
@AllArgsConstructor
@NoArgsConstructor
@Table(name="administration")
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

    @Column
    private String phone;

    @Column
    private String email;

    @Column(name = "date_admission", nullable = false)
    private Timestamp timestamp = Timestamp.from(Instant.now());

    @Column
    private Date dateOfBirth;

    @Column
    private boolean isActive = Boolean.FALSE;;

}
