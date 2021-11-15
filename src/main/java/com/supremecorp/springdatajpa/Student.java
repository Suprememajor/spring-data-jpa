package com.supremecorp.springdatajpa;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Created by suprememajor on the 11/15/21
 */
@Entity(name = "Student")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;
    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;
}
