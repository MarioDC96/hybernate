package it.Develhope.hybernate.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Students students;

    @ManyToOne
    private Classes classes;
}
