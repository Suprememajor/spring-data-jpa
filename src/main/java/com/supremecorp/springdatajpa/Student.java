package com.supremecorp.springdatajpa;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    private Long id;
    private Integer age;
    private String email;
    private String firstName;
    private String lastName;
}
